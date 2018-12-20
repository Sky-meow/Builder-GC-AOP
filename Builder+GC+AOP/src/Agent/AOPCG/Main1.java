package Agent.AOPCG;

import net.sf.cglib.proxy.Enhancer;

public class Main1 {
    public static void main(String[] args) {
        Fishing fishing = (Fishing) Enhancer.create(Fishing.class, null, new CGAgent());
        fishing.toDo();

//        CGAgent cgAgent = new CGAgent();

//        Enhancer enhancer = new Enhancer();
//        enhancer.setClassLoader(Thread.currentThread().getContextClassLoader());
//        enhancer.setSuperclass(Fishing.class);
//        enhancer.setCallback(cgAgent);
//        Fishing fishing = (Fishing) enhancer.create();
//        fishing.toDo();
    }
}
