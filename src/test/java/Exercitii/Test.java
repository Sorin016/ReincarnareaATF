package Exercitii;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.cucumber.java.an.E;
import io.cucumber.java.sl.In;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    Status[] s=Status.values();
    for(Status ss:s)
        System.out.println(ss+" "+ss.getN());
  }
}
enum Status {
    BEGINER(1),MEDIUM(2),SENIOR(3);
    int n;
    Status(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
}