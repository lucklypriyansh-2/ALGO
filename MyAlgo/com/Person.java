package com;

public class Person {
	
	int age;
	
	public Person(int age) {
		// TODO Auto-generated constructor stub
this.age=age;
	}
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String... args)
	{
		
		Person[] personarrat = new Person[5];
		personarrat[0]=new Person(2);
		personarrat[1]=new Person(1);
		personarrat[2]=new Person(0);
		personarrat[3]=new Person(3);
		personarrat[4]=new Person(5);
		
	Person.insertionSort(personarrat);
	}
	
	public static Person[] insertionSort(Person[] list)
	{
	    int i, j;
	    Person key, temp;
	    for(i = 1; i<list.length; i++)
	    {
	        key= list[i];
	        j = i-1;
	       int k=i;
	        while(j>=0&& list[k].compareTo(list[j]) < 0 )
	        {
	            temp = list[j];
	            list[j] = list[j+1];
	            list[j+1] = temp;
	            j--;
	        k--;
	        }
	    }
	    return list;
	}

	
	public int compareTo(Person person)
	    {
	        int anotherAge = person.getAge();
	        return (age<anotherAge ? -1 : (age==anotherAge ? 0 : 1));
	
	    }

	
	

}

