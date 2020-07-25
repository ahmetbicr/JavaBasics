package com.syntax.class26;

public abstract class File {

	// Create a class File that will have the following behaviors: open, edit,
	// close. Edit and close are implemented method while open is an abstract.
	// Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
	// implementation of open behaviour: Example: to open .java file we need
	// notepad++ or sublime text, to open .doc file we need Microsoft word to be
	// installed etc

	public abstract void open();

	public void edit() {
		System.out.println("It's possible to edit a file if it's in edit mode");
	}

	public void close() {
		System.out.println("One of the common way to close is by clicking on X");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open .java file we need notepad++  or sublime text");
	}
}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed or any compatiable program");
	}
}

class PdfFile extends File {

	@Override
	public void open() {
		System.out.println("To open .pdf file we need Adobe Acrobat Reader to installed");
	}

}
