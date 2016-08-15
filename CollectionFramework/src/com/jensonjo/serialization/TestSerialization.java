package com.jensonjo.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization implements Serializable {
	String name;
	transient String ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		TestSerialization test = new TestSerialization();
		test.setName("Jenson");
		test.setSsn("122.12.1234");
		FileOutputStream fos = new FileOutputStream("C:/CMD/object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);
		System.out.println("File written to disk");

		FileInputStream fin = new FileInputStream("C:/CMD/object.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		TestSerialization read = (TestSerialization) ois.readObject();
		System.out.println("Name : " + read.getName() + "\tSSN : " + read.getSsn());
	}

}
