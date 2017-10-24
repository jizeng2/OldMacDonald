class Cow implements Animal 
{       
  private String myType;     
  private String mySound;
  public Cow()
  {
    myType = "cow";
    mySound= "moo";
  }
  public Cow(String type, String sound) { 
    myType= type;          
    mySound= sound;
  }     
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }  //your code here
}