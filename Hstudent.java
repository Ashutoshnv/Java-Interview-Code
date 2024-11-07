package com.example.StudentApplication;
import org.springframework.stereotype.Component;

@Component
public class Student 
{

int id;

String name;

public int getId() {

return id;

}

public void setId(int id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public void Show()

{System.out.println("Name:"+name);}

}
