package com.techstack.problems;

import java.util.HashSet;
import java.util.Set;

public class TestMainNotToAddDuplicateObjects {

	public static void main(String[] args) {
		Set<TestHashSet> elements = new HashSet<>();
		elements.add(new TestHashSet(10));
		elements.add(new TestHashSet(10));
		elements.add(new TestHashSet(30));
		System.out.println(elements);
	}

}

class TestHashSet {
	
	private int i = 0;
	
	public TestHashSet(int i) {
		this.i = i;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TestHashSet) {
			TestHashSet pp = (TestHashSet) o;
            return pp.i == this.i;
        } else {
            return false;
        }
	}
	
	public int hashCode(){
        int hashcode = 0;
        hashcode = i*20;
        return hashcode;
    }

	public String toString() {
		return "" + i;
	}
}