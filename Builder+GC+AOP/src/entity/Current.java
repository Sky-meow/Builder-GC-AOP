package entity;

public class Current {
    private int A;
    private int V;

    @Override
    public String toString() {
        return "Current{" +
                "电流='" + A + '\'' +
                "电压='" + V + '\'' +
                '}';
    }

    public static class Currents {
        public int A;
        public int V;

        public Currents setA(int a) {
            A = a;
            return this;
        }

        public Currents setB(int b) {
            V = b;
            return this;
        }

        public Current getCurrent() {
            Current current = new Current();
            current.A = this.A;
            current.V = this.V;
            return current;
        }
    }
}
