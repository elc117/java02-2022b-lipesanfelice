class MesaCadeira {
  private String nome1;
  private int x;

  private String nome2;
  private int y;

  public MesaCadeira() {
    y = 0;
    x = 0;
    nome1 = "a";
    nome2 = "a";
  }

  public int getY() {
     return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
     return x;
  }

  public void setX(int x) {
    this.x = x;
  }
  
  public String getnome1() {
    return nome1;
  }
  
  public void setnome1(String nome1) {
    this.nome1 = nome1;
  }

  public String getnome2() {
    return nome2;
  }
  
  public void setnome2(String nome2) {
    this.nome2 = nome2;
  }

  public int soma(){
    return x+y;
  }

}
