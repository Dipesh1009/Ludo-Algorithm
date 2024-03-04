import java.util.Stack;

public class StackTest {
    Stack<tokenTest> house = new Stack<tokenTest>();
    nodeTest nodeGate = null;

    StackTest() {}

    StackTest (nodeTest node1) {
        this.nodeGate = node1;
    }

    boolean overflow(){
        if (house.size() < 4) {
            return false;
        }
        return true;
    }

    void in (tokenTest T){
        if (!(overflow())){
            return;
        }
        house.push(T);
    }

    void out (){
        if (house.empty()){
            return;
        }
        house.pop();
    }

    tokenTest top () {
        tokenTest T = new tokenTest();
        T = house.peek();
        return T;
    }
} 