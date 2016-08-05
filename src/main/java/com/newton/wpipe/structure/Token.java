package com.newton.wpipe.structure;

/**
 * Created by newton on 8/4/16.
 */
public class Token {
  public String token;
  public int begin;
  public int end;

  public Token(String token, int begin, int end) {
    this.token = token;
    this.begin = begin;
    this.end = end;
  }
}
