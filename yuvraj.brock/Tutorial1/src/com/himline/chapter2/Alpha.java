package com.himline.chapter2;

class Alpha {
	Alpha doStuff(char c) {
		return new Alpha();
	}
}

class Beta extends Alpha {
	Beta doStuff(char c) { // legal override in Java 1.5
		return new Beta();
	}
}