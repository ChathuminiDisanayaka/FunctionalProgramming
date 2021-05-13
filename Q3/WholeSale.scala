object WholeSale extends App{
  def totalwholesale(n:Int) = if (n>50) (60*24.95*n)/100+50*3+(n-50)*0.75 else (60*24.95*n)/100+n*3;
  println("Whole Sale of 60 books is " +totalwholesale(60));
}
