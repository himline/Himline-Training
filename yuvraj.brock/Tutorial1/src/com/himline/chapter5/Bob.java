package com.himline.chapter5;

public class Bob {
String nickname;
int age;

Bob(String nickname, int age){
	this.nickname=nickname;
	this.age=age;
}
public String toString(){
	return ("I am a Bob, but you can call me " + nickname +
			". My shoe size is " + age);
}
}
