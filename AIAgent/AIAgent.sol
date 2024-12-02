// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

interface IAIOracle {
    function requestData(string memory dataType) external returns (bytes32);
    function getData(bytes32 requestId) external view returns (uint256);
}

contract AIOracle is IAIOracle {
    struct Request {
        uint256 data;
        bool isCompleted;
    }
    
    mapping(bytes32 => Request) public requests;
    address public owner;
    
    modifier onlyOwner() {
        require(msg.sender == owner, "Not the contract owner");
        _;
    }

    constructor() {
        owner = msg.sender;
    }

    function requestData(string memory dataType) external override returns (bytes32) {
        // Generate a unique request ID
        bytes32 requestId = keccak256(abi.encodePacked(block.timestamp, msg.sender, dataType));
        
        // Call off-chain AI agent (this part should call an oracle or AI API)
        // For demonstration, we mock the result with random data
        uint256 result = uint256(keccak256(abi.encodePacked(requestId))) % 100;
        
        requests[requestId] = Request({
            data: result,
            isCompleted: true
        });
        
        return requestId;
    }
    
    function getData(bytes32 requestId) external view override returns (uint256) {
        require(requests[requestId].isCompleted, "Data not available yet");
        return requests[requestId].data;
    }
}
