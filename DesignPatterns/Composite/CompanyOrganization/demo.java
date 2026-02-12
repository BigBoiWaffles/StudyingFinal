public static void main(String[] args){
  department Company = new department("Company");
  department Engineering = new department("Engineering");
  department BackendTeam = new department("Backend Team");
  department FrontendTeam = new department("Frontend Team");
  department Marketing = new department("Marketing");
  
  employee John = new employee("John", "Senior Developer", 120000);
  employee Jane = new employee("Jane", "Junior Developer", 80000);
  employee Bob = new employee("Bob", "UI Designer", 900000);
  employee Alice = new employee("Alice", "Marketing Manager", 100000);

  Company.add_employee(Engineering);
  Company.add_employee(Marketing);

  Engineering.add_employee(BackendTeam);
  Engineering.add_employee(FrontendTeam);

  BackendTeam.add_employee(John);
  BackendTeam.add_employee(Jane);

  FrontendTeam.add_employee(Bob);

  Marketing.add_employee(Alice);

  System.out.println(Company.total_salary());
  System.out.println(Company.head_count());

  Company.printStructure(0);

}
