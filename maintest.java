import java.util.Scanner;

class maintest {

    
    // FUNCTION TO GIVE DICE VALUE

    private static int Dice () {
        diceTest d = new diceTest();
        return d.randomInts();
    }

    
    
    
   
    // FUNCTION TO CREATE MAP OBJECT

    private static MapTest2 Map() {
        MapTest2 m = new MapTest2();
        return m;
    }

 
 
 
 
    // FUNCTION TO CHECK IF ENTRY GATE IS AVAILABLE

    private static boolean isEntryEligible (tokenTest t, nodeTest EntryNode) {
        if (t.t == EntryNode.nodeEntry.colorFlag ) {
            return true;
        }
        else {
            return false;
        }

    }

   
   
   
   
   
    // FUNCTION TO CHECK IF KILL IS AVAILABLE

    private static boolean isKillAvailable (nodeTest node, tokenTest t) {
        
        if (node.gate_type == 'S' || node.gate_type == 'G') {
            return false;
        }

        if (node.t1 == null ){
            return false;
        }
        else if (node.t2 == null) {
            if (node.t1.t != t.t){
                return true;
            }
            else {
                return false;
            }
        }
        return false;

    }

    
    
    
    
    
    // FUNCTION TO MOVE THE TOKEN VALUE TO NODES

    private static void moveToken(tokenTest t, nodeTest node) {
        if (node.t1 == null) {
            node.t1 = t;
            t.currentNode.pop(t);
            t.currentNode = node;
        }
        else if (node.t2 == null) {
            node.t2 = t;
            t.currentNode.pop(t);
            t.currentNode = node;
        }
        else if (node.t3 == null) {
            node.t3 = t;
            t.currentNode.pop(t);
            t.currentNode = node;
        }
        else {
            node.t4 = t;
            t.currentNode.pop(t);
            t.currentNode = node;
        }
    }
    
    
    
    
    // FUNCTION TO ANNOUNCE WHICH TOKEN IS KILLED

    private static void announceKill (tokenTest t, tokenTest KilledToken) {
        System.out.println("Token " + t.id + " killed Token " + KilledToken.id);
    }
    

    
    
    // FUNCTION TO KILL THE OTHER PLAYER TOKEN

    private static void tokenKiller (nodeTest node, tokenTest t){

        tokenTest KilledToken = node.t1;
        node.t1 = null;
        KilledToken.currentNode = null;
        KilledToken.house.in(KilledToken);
        
        moveToken(t, node);

        //call the function for announcing the kill

        announceKill(t, KilledToken);
    }

    
    
    
    // FUNCTION TO MOVE TOKEN TO FINAL HOUSE

    private static void tokenToFinal(StackTest finalHouse, tokenTest t) {
        finalHouse.in(t);
        t.currentNode.pop(t);
        t.currentNode = null; 
    }

    
    
    
    
    // FUNCTION TO MOVE TOKEN ON MAP

    private static void tokenMover(int diceX, tokenTest t) {
        nodeTest currNode = t.currentNode;
        for (int i = 0; i < diceX; i++) {
            if ((i == (diceX -1)) && (currNode.nodeStack != null)) {
                tokenToFinal(currNode.nodeStack, t);
            }

            if (currNode == null) {
                System.out.println("Token can't move");
                return;
            }
            
            if (currNode.nodeEntry != null) {
                if (isEntryEligible(t, currNode)){
                    currNode = currNode.nodeEntry;
                }
                else {
                    currNode = currNode.node1;
                }
            }
            else {
                currNode = currNode.node1;
            }
        } 

        if (isKillAvailable(currNode, t)) {
            tokenKiller(currNode, t);
        }
        else {
            moveToken(t, currNode);
        }

    }
    
    //FUNCTION TO SET PLAYERS DATA ARRAY

                // {{"red", "n", "-1", "-1", "-1", "-1"}, 
                // {"yellow", "n", "-1", "-1", "-1", "-1"}, 
                // {"blue", "n", "-1", "-1", "-1", "-1"}, 
                // {"green", "n", "-1", "-1", "-1", "-1"}}

    private static void setPlayers(int players, String [][] playersData) {
        for (int i = 0; i < players; i++) {
            playersData[i][1] = "p";
        }
    }
    
    
    //////////////////////////////////////////////  MAIN  //////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////// DRIVER FUNCTION /////////////////////////////////////////////

    public static void main(String[] args) {
        // creating Map variable
        MapTest2 map = Map();

        //Initializing the input reader object
        
        Scanner inp = new Scanner(System.in);

        // creating pointer variables to Gate House Stacks

        StackTest RedHouse = map.InitRedHouse;
        StackTest GreenHouse = map.InitGreenHouse;
        StackTest BlueHouse = map.InitBlueHouse;
        StackTest YellowHouse = map.InitYellowHouse;

        // CREATING POINTER VARIABLE FOR FINAL HOUSE STACKS

        StackTest finalRedHouse = map.finalRedHouse;
        StackTest finalGreenHouse = map.finalGreenHouse;
        StackTest finalBlueHouse = map.finalBlueHouse;
        StackTest finalYellowHouse = map.finalYellowHouse;

        // creating tokens and player variable

        String players[][] =    {{"red", "n", "-1", "-1", "-1", "-1"}, 
                                {"yellow", "n", "-1", "-1", "-1", "-1"}, 
                                {"blue", "n", "-1", "-1", "-1", "-1"}, 
                                {"green", "n", "-1", "-1", "-1", "-1"}};


        // Selecting no. of players

        System.out.println("Enter the no. of players: ");
        int total_players =  inp.nextInt();
        
        setPlayers(total_players, players);


        // SETTING TOKENS FOR ADDED PLAYERS

        for(int j = 0; j < total_players; j++) {

            // RED HOUSE
            
            
            if (j == 0){
                for(int i = 0; i < 4; i++) {
                tokenTest t = new tokenTest('r', players[1][1], RedHouse);
                RedHouse.in(t);
            }
            }

            // YELLOW HOUSE

            if (j == 1){
                for(int i = 0; i < 4; i++) {
                    tokenTest t = new tokenTest('y', players[2][1], YellowHouse);
                    YellowHouse.in(t);
                }
            }
            // BLUE HOUSE
            
            if (j == 2){
                for(int i = 0; i < 4; i++) {
                    tokenTest t = new tokenTest('b', players[3][1], BlueHouse);
                    BlueHouse.in(t);
                }
            }
            
            // GREEN HOUSE
            
            if (j == 3){
                for(int i = 0; i < 4; i++) {
                    tokenTest t = new tokenTest('g', players[4][1], GreenHouse);
                    GreenHouse.in(t);
                }
            }
        
        }


    }
}