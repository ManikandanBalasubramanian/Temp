package com.leetcode.medium;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class InvalidTransactions{

	    public List<String> invalidTransactions(String[] transactions) {

	        Transaction[] tr = Arrays.stream(transactions).map(Transaction::new).toArray(Transaction[]::new);

	        Set<Integer> set = new HashSet<>();
	        
	        for(int i = 0 ; i < tr.length; i++) {
	            for(int j = i; j < tr.length; j++) {
	            
	                boolean amount = (tr[i].amount > 1000);
	                
	                boolean duplicate = (Math.abs(tr[i].time-tr[j].time) <= 60)  && (tr[i].name.equals(tr[j].name)) && (!tr[i].city.equals(tr[j].city));

	                
	                if(amount) set.add(i);

	                if(duplicate) {
	                    set.add(i);
	                    set.add(j);
	                }
	            }
	        }
	        
	        return set.parallelStream().map(i -> tr[i].toString()).collect(Collectors.toList());
	    }
	    
	}

	class Transaction {
	    String name;
	    int time;
	    int amount;
	    String city;
	    
	    Transaction(String str) {
	        String[] val = str.split(",");
	        name = val[0];
	        time = Integer.parseInt(val[1]);
	        amount = Integer.parseInt(val[2]);
	        city = val[3];
	    }
	    
	    public String toString() {
	        return name +"," + time + "," + amount + "," + city;
	    }
	    
	}