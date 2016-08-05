package com.newton.wpipe.algorithms;

import com.newton.wpipe.templates.BaseCasInterface;
import com.newton.wpipe.structure.Token;

import java.util.List;

/**
 * Created by newton on 8/4/16.
 */
public interface TokenizerInterface extends BaseCasInterface {
  /*
   *  Create a List<Token> object in CAS object
   */
  public void setTokens(List<Token> tokens);

  /*
   *  return List<Token>
   */
  public List<Token> getTokens();
}
