public class employee implements component {
  private String name;
  private String jobTitle;
  private double salary;

  public employee(String name, String jobTitle, double salary){
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  @Override
  public String getName(){ return this.name; }

  @Override
  public double total_salary(){
    return this.salary;
  }

  @Override
  public int head_count(){
    return 1;
  }

  @Override
  public void printStructure(int depth){
    String finalString = "";
    for (int i = 0; i <= depth * 2; i++){
      finalString = finalString + " ";
    }
    System.out.println(finalString + this.name + ", " + this.jobTitle + ", " + this.salary);
  }
} 
