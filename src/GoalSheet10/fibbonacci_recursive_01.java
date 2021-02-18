package GoalSheet10;

class fibbonacci_recursive_01 {
  public static void main(String[] args) {
   System.out.println(fibbonnaci(5));
  }
                        
  public static int fibbonnaci(int n)
  {
    if(n < 2)
    {
      return n; 
    }
    return (fibbonnaci(n -1) + fibbonnaci(n-2));
  }
} 