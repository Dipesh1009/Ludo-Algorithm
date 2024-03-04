public class MapTest {
     //Set 1
     nodeTest p1 = new nodeTest();           // pathway 1
     nodeTest p2 = new nodeTest(p1);           // stating point (brance) gate
     nodeTest p3 = new nodeTest(p2);           // pathway 2
     nodeTest p4 = new nodeTest(p3);           // pathway 3
     nodeTest p5 = new nodeTest(p4);           // pathway 4
     nodeTest p6 = new nodeTest(p5);           // pathway 5
     nodeTest p7 = new nodeTest(p6);           // pathway 6
     nodeTest p8 = new nodeTest(p7);           // pathway 7
     nodeTest p9 = new nodeTest(p8);           // pathway 8
     nodeTest p10 = new nodeTest(p9);          // secure point
     nodeTest p11 = new nodeTest(p10);           // pathway 9
     nodeTest p12 = new nodeTest(p11);           // entry point (branch to house path)
     nodeTest p13 = new nodeTest(p12);          // pathway 10
     nodeTest p14 = new nodeTest(p13);          // pathway 11
     nodeTest p15 = new nodeTest(p14);          // pathway 12
     nodeTest p16 = new nodeTest(p15);          // pathway 13
     nodeTest p17 = new nodeTest(p16);          // pathway 14 (house stack branch)

     //set 2
     nodeTest p18 = new nodeTest(p17);          // pathway 1
     nodeTest p19 = new nodeTest(p18);          // starting point (branch to) gate
     nodeTest p20 = new nodeTest(p19);          // pathway 2
     nodeTest p21 = new nodeTest(p20);          // pathway 3
     nodeTest p22 = new nodeTest(p21);          // pathway 4
     nodeTest p23 = new nodeTest(p22);          // pathway 5
     nodeTest p24 = new nodeTest(p23);          // pathway 6
     nodeTest p25 = new nodeTest(p24);          // pathway 7
     nodeTest p26 = new nodeTest(p25);          // pathway 8
     nodeTest p27 = new nodeTest(p26);          // secure point
     nodeTest p28 = new nodeTest(p27);          // pathway 9
     nodeTest p29 = new nodeTest(p28);          // entry point (branch to house path)
     nodeTest p30 = new nodeTest(p29);          // pathway 10
     nodeTest p31 = new nodeTest(p30);          // pathway 11
     nodeTest p32 = new nodeTest(p31);          // pathway 12
     nodeTest p33 = new nodeTest(p32);          // pathway 13
     nodeTest p34 = new nodeTest(p33);          // pathway 14 (house stack branch)

     // set 3
     nodeTest p35 = new nodeTest(p34);          // pathway 1
     nodeTest p36 = new nodeTest(p35);          // starting point (branch to) gate
     nodeTest p37 = new nodeTest(p36);          // pathway 2
     nodeTest p38 = new nodeTest(p37);          // pathway 3
     nodeTest p39 = new nodeTest(p38);          // pathway 4
     nodeTest p40 = new nodeTest(p39);          // pathway 5
     nodeTest p41 = new nodeTest(p40);          // pathway 6
     nodeTest p42 = new nodeTest(p41);          // pathway 7
     nodeTest p43 = new nodeTest(p42);          // pathway 8
     nodeTest p44 = new nodeTest(p43);          // secure point
     nodeTest p45 = new nodeTest(p44);          // pathway 9
     nodeTest p46 = new nodeTest(p45);          // entry point (branch to house path)
     nodeTest p47 = new nodeTest(p46);          // pathway 10
     nodeTest p48 = new nodeTest(p47);          // pathway 11
     nodeTest p49 = new nodeTest(p48);          // pathway 12
     nodeTest p50 = new nodeTest(p49);          // pathway 13     
     nodeTest p51 = new nodeTest(p50);          // pathway 14 (house stack branch)

     //set 4
     nodeTest p52 = new nodeTest(p51);          // pathway 1
     nodeTest p53 = new nodeTest(p52);          // starting point (branch to) gate
     nodeTest p54 = new nodeTest(p53);          // pathway 2
     nodeTest p55 = new nodeTest(p54);          // pathway 3
     nodeTest p56 = new nodeTest(p55);          // pathway 4
     nodeTest p57 = new nodeTest(p56);          // pathway 5
     nodeTest p58 = new nodeTest(p57);          // pathway 6
     nodeTest p59 = new nodeTest(p58);          // pathway 7
     nodeTest p60 = new nodeTest(p59);          // pathway 8
     nodeTest p61 = new nodeTest(p60);          // secure point
     nodeTest p62 = new nodeTest(p61);          // pathway 9
     nodeTest p63 = new nodeTest(p62);          // entry point (branch to house path)
     nodeTest p64 = new nodeTest(p63);          // pathway 10
     nodeTest p65 = new nodeTest(p64);          // pathway 11
     nodeTest p66 = new nodeTest(p65);          // pathway 12
     nodeTest p67 = new nodeTest(p66);          // pathway 13
     nodeTest p68 = new nodeTest(p67);          // pathway 14 (house stack branch)

     //Initial houses
     StackTest InitRedHouse = new StackTest();
     StackTest InitYellowHouse = new StackTest();
     StackTest InitBlueHouse = new StackTest();
     StackTest InitGreenHouse = new StackTest();

     //Destination Houses
     StackTest finalRedHouse = new StackTest();
     StackTest finalYellowHouse = new StackTest();
     StackTest finalBlueHouse = new StackTest();
     StackTest finalGreenHouse = new StackTest();

     private void joinInitLast(){
          p1.joinNode(p62);
     }   
     
     private void joinNodeHouse() {
          //Initial house connections
          p2.joinHouse(InitRedHouse);
          p19.joinHouse(InitYellowHouse);
          p36.joinHouse(InitBlueHouse);
          p53.joinHouse(InitGreenHouse);

          //Win house connections
          p17.joinHouse(InitRedHouse);
          p34.joinHouse(InitYellowHouse);
          p51.joinHouse(InitBlueHouse);
          p68.joinHouse(InitGreenHouse);

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

     MapTest() {
          this.joinInitLast();
          this.joinNodeHouse();
          this.setNodes();
     }
}



// 1 pathway - 1 starting point stack (branch to) 1 gate – 7 pathways – 1 secure point – 1 pathway – 1 entry point (branch to house path – 5 pathways – 1 house stack) loop three times connecting the whole map