import java.util.ArrayList;

public class department implements component{
  private String departmentName;
  private ArrayList<component> departments = new ArrayList<component>();
  
  public department(String name){
    this.departmentName = name;
  }

  @Override
  public String getName(){ return this.departmentName; }

  public void remove_employee(component employee){
    if (this.departments.contains(employee)) {
      System.out.println("Removed " + employee.getName()); 
      this.departments.remove(employee);
      return;
    } else {
      System.out.println("Employee does not exist");
      return;
    }
  }

  public void add_employee(component employee){
    if (this.departments.contains(employee)){
      System.out.println("Employee already exists");
      return;
    } else {
      System.out.println("Employee added");
      this.departments.add(employee);
      return;
    }
  }

  @Override
  public double total_salary(){
    int total = 0;
    for(component departments : this.departments){
      total += departments.total_salary();
    }

    return total;
  }

  @Override
  public int head_count(){
    int total = 0;
    for(component departments : this.departments){
      total += departments.head_count();
    }

    return total;
  }

  @Override
  public void printStructure(int depth){
    String finalString = "";
    for(int i = 0; i <= depth * 2; i++){
      finalString = finalString + " ";
    }
    System.out.println(finalString + this.getName());
    for (component departments : this.departments){
      departments.printStructure(depth + 1);
    }
  }
}
