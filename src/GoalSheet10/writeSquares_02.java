class Main {
  public static void main(String[] args) {
    
    System.out.println(writeSquares(10));
  }
  public static int  writeSquares(int n)
  {
    //first n squares, odd in descending and even in acsending
      if(n<=1)
      {
        return 0;
      }
      
      return writeSquares( ((n-1)*(n-1)) + (2*n) -1 )? ;
        
  }
}