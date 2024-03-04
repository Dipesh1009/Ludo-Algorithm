public class MapTest2 {
    
    //creating new map nodes set
    
    //Destination Houses
    StackTest finalRedHouse = new StackTest();
    StackTest finalYellowHouse = new StackTest();
    StackTest finalBlueHouse = new StackTest();
    StackTest finalGreenHouse = new StackTest();
    
    //set 1

    nodeTest p1 = new nodeTest();

    //set 4 (Green House)

    nodeTest p68 = new nodeTest(finalRedHouse);
    nodeTest p67 = new nodeTest(p68,'r');
    nodeTest p66 = new nodeTest(p67,'r');
    nodeTest p65 = new nodeTest(p66,'r');
    nodeTest p64 = new nodeTest(p65,'r');
    nodeTest p63 = new nodeTest(p1,p64);
    nodeTest p62 = new nodeTest(p63);
    nodeTest p61 = new nodeTest(p62);
    nodeTest p60 = new nodeTest(p61);
    nodeTest p59 = new nodeTest(p60);
    nodeTest p58 = new nodeTest(p59);
    nodeTest p57 = new nodeTest(p58);
    nodeTest p56 = new nodeTest(p57);
    nodeTest p55 = new nodeTest(p56);
    nodeTest p54 = new nodeTest(p55);
    nodeTest p53 = new nodeTest(p54);
    nodeTest p52 = new nodeTest(p53);

    //set 3 (Blue House)

    nodeTest p51 = new nodeTest(finalGreenHouse);
    nodeTest p50 = new nodeTest(p51,'g');
    nodeTest p49 = new nodeTest(p50,'g');
    nodeTest p48 = new nodeTest(p49,'g');
    nodeTest p47 = new nodeTest(p48,'g');
    nodeTest p46 = new nodeTest(p52,p47);
    nodeTest p45 = new nodeTest(p46);
    nodeTest p44 = new nodeTest(p45);
    nodeTest p43 = new nodeTest(p44);
    nodeTest p42 = new nodeTest(p43);
    nodeTest p41 = new nodeTest(p42);
    nodeTest p40 = new nodeTest(p41);
    nodeTest p39 = new nodeTest(p40);
    nodeTest p38 = new nodeTest(p39);
    nodeTest p37 = new nodeTest(p38);
    nodeTest p36 = new nodeTest(p37);
    nodeTest p35 = new nodeTest(p36);

    //set 2 (Yellow House)

    nodeTest p34 = new nodeTest(finalBlueHouse);
    nodeTest p33 = new nodeTest(p34,'b');
    nodeTest p32 = new nodeTest(p33,'b');
    nodeTest p31 = new nodeTest(p32,'b');
    nodeTest p30 = new nodeTest(p31,'b');
    nodeTest p29 = new nodeTest(p35,p30);
    nodeTest p28 = new nodeTest(p29);
    nodeTest p27 = new nodeTest(p28);
    nodeTest p26 = new nodeTest(p27);
    nodeTest p25 = new nodeTest(p26);
    nodeTest p24 = new nodeTest(p25);
    nodeTest p23 = new nodeTest(p24);
    nodeTest p22 = new nodeTest(p23);
    nodeTest p21 = new nodeTest(p22);
    nodeTest p20 = new nodeTest(p21);
    nodeTest p19 = new nodeTest(p20);
    nodeTest p18 = new nodeTest(p19);

    //set 1 (Red House)

    nodeTest p17 = new nodeTest(finalYellowHouse);
    nodeTest p16 = new nodeTest(p17,'y');
    nodeTest p15 = new nodeTest(p16,'y');
    nodeTest p14 = new nodeTest(p15,'y');
    nodeTest p13 = new nodeTest(p14,'y');
    nodeTest p12 = new nodeTest(p18,p13);
    nodeTest p11 = new nodeTest(p12);
    nodeTest p10 = new nodeTest(p11);
    nodeTest p9 = new nodeTest(p10);
    nodeTest p8 = new nodeTest(p9);
    nodeTest p7 = new nodeTest(p8);
    nodeTest p6 = new nodeTest(p7);
    nodeTest p5 = new nodeTest(p6);
    nodeTest p4 = new nodeTest(p5);
    nodeTest p3 = new nodeTest(p4);
    nodeTest p2 = new nodeTest(p3);
    
    //Initial houses
    StackTest InitRedHouse = new StackTest(p2);
    StackTest InitYellowHouse = new StackTest(p19);
    StackTest InitBlueHouse = new StackTest(p36);
    StackTest InitGreenHouse = new StackTest(p53);


    private void joinInitLast(){
        p1.joinNode(p2);
   }   

   private void setNodes() {

        //Pathway Setup
        //Set 1
        p1.setPathway();
        p3.setPathway();
        p4.setPathway();
        p5.setPathway();
        p6.setPathway();
        p7.setPathway();
        p8.setPathway();
        p9.setPathway();
        p11.setPathway();
        p13.setPathway();
        p14.setPathway();
        p15.setPathway();
        p16.setPathway();
        p17.setPathway();
        
        //Set 2
        p18.setPathway();
        p20.setPathway();
        p21.setPathway();
        p22.setPathway();
        p23.setPathway();
        p24.setPathway();
        p25.setPathway();
        p26.setPathway();
        p28.setPathway();
        p30.setPathway();
        p31.setPathway();
        p32.setPathway();
        p33.setPathway();
        p34.setPathway();

        //Set 3
        p35.setPathway();
        p37.setPathway();
        p38.setPathway();
        p39.setPathway();
        p40.setPathway();
        p41.setPathway();
        p42.setPathway();
        p43.setPathway();
        p45.setPathway();
        p47.setPathway();
        p48.setPathway();
        p49.setPathway();
        p50.setPathway();
        p51.setPathway();

        //Set 4
        p52.setPathway();
        p54.setPathway();
        p55.setPathway();
        p56.setPathway();
        p57.setPathway();
        p58.setPathway();
        p59.setPathway();
        p60.setPathway();
        p62.setPathway();
        p64.setPathway();
        p65.setPathway();
        p66.setPathway();
        p67.setPathway();
        p68.setPathway();
        
        //Entry Setup 
        p12.setEntry();
        p29.setEntry();
        p46.setEntry();
        p63.setEntry();

        //Secure Setup
        p10.setSecure();
        p27.setSecure();
        p44.setSecure();
        p61.setSecure();

        //Gate Start Setup
        p2.setGate();
        p19.setGate();
        p36.setGate();
        p53.setGate();
    }

    MapTest2() {
        this.joinInitLast();
        this.setNodes();
    }
 
}
