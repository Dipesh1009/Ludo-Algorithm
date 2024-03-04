public class nodeTest {
    tokenTest t1 = null;
    tokenTest t2 = null;
    tokenTest t3 = null;
    tokenTest t4 = null;
    char gate_type;
    nodeTest node1 = null, nodeEntry = null;
    StackTest nodeStack = null;
    char colorFlag = 'N';

    nodeTest() {}

    nodeTest(nodeTest node1, char f) {
        this.node1 = node1;
        this.colorFlag = f;
    }

    nodeTest(nodeTest node1) {
        this.node1 = node1;
    }
    
    nodeTest(nodeTest node1, nodeTest node2) {
        this.node1 = node1;
        this.nodeEntry = node2;
    }

    nodeTest (StackTest node1) {
        this.nodeStack = node1;
    }

    //FUNCTION TO PUSH TOKEN VALUE IN 4 SLOTS INDEPENDENTLY

    public void pushT1(tokenTest t) {
        this.t1 = t;
    }
    public void pushT2(tokenTest t) {
        this.t2 = t;
    }
    public void pushT3(tokenTest t) {
        this.t3 = t;
    }
    public void pushT4(tokenTest t) {
        this.t4 = t;
    }

    // FUNCTION TO POP TOKEN VALUE FROM 4 SLOTS INDEPENDENTLY

    public void popT1() {
        this.t1 = null;
    }
    public void popT2() {
        this.t2 = null;
    }
    public void popT3() {
        this.t3 = null;
    }
    public void popT4() {
        this.t4 = null;
    }

    public void resetToken() {
        nodeStack.in(t1);
        this.t1 = null;
    }

    public void joinNode(nodeTest lastNode) {
        this.node1 = lastNode;
    }

    public void joinHouse (StackTest house) {
        this.nodeStack = house;
    }

    public void setPathway() {
        this.gate_type = 'P';
    }

    public void setSecure() {
        this.gate_type = 'S';        
    }

    public void setGate() {
        this.gate_type = 'G';
    }

    public void setEntry() {
        this.gate_type = 'E';
    }

    public void say() {
        System.out.println("Hello World");
    }
}

