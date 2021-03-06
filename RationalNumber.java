public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    if(deno == 0){
        this.deno = 1;
        this.nume = 0;
    }
    else{
        this.deno = deno;
        this.nume = nume;
    }    
  }

  public double getValue(){
    return this.nume / this.deno;//???
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return this.nume;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return this.deno;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return this.deno / this.nume;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return rationalNumber == other;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return this.nume + "/" + this.deno;
  }



  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    return 0;
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

  }



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return this.reduce() + other.reduce());
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return this.reduce() - other.reduce();
  }
} 
