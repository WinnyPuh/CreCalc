public class Calc{
  private int result;

  public void cleanResult(){
    this.result = 0;
  }

  public int getResult(){
    return this.result;
  }

  public void add(int ... params){
    for(int param : params){
      this.result += param;
    }
  }
}
