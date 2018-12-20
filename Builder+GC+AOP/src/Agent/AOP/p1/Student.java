package Agent.AOP.p1;

public class Student implements Exam{
    @Override
    public void toDo() {
        System.out.println("我正在疯狂补作业");
    }
    public void playGame() {
        System.out.println("我玩得很开心，可带劲了");
    }
}
