window.onload = function() {
    let dinos = {

//Carnivores

        carnotaurus: {
            fullAdult: {
                bleedStandResist: 70,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 60,
                weight: 2170,
                health: 2170,
                damage: 200,
                bleed: 15,
            },
            midAdult: {
                bleedStandResist: 70,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 60,
                weight: findMidValues(880,2170),
                health: findMidValues(350,2170),
                damage: findMidValues(75,200),
                bleed: findMidValues(15,15),
            },
            freshAdult: {
                bleedStandResist: 70,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 60,
                weight: 880,
                health: 350,
                damage: 75,
                bleed: 15,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 850,
                health: 350,
                damage: 75,
                bleed: 15,
            },
            midJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: findMidValues(150,850),
                health: findMidValues(120,350),
                damage: findMidValues(50,75),
                bleed: findMidValues(15,15),
            },
            freshJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 150,
                health: 120,
                damage: 50,
                bleed: 15,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        dilophosaurus: {
            fullAdult: {
                bleedStandResist: 25,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 1200,
                health: 1050,
                damage: 150,
                bleed: 50,
            },
            midAdult: {
                bleedStandResist: 25,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: findMidValues(900,1200),
                health: findMidValues(650,1050),
                damage: findMidValues(75,150),
                bleed: findMidValues(50,50),
            },
            freshAdult: {
                bleedStandResist: 25,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 900,
                health: 650,
                damage: 75,
                bleed: 50,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 900,
                health: 650,
                damage: 70,
                bleed: 20,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: findMidValues(150,900),
                health: findMidValues(250,650),
                damage: findMidValues(27,70),
                bleed: findMidValues(20,20),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 150,
                health: 250,
                damage: 27,
                bleed: 20,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        utahraptor: {
            fullAdult: {
                bleedStandResist: 20,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 1000,
                health: 1200,
                damage: 200,
                bleed: 20,
            },
            midAdult: {
                bleedStandResist: 20,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: findMidValues(250,1000),
                health: findMidValues(300,1200),
                damage: findMidValues(60,200),
                bleed: findMidValues(10,20),
            },
            freshAdult: {
                bleedStandResist: 20,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 250,
                health: 300,
                damage: 60,
                bleed: 10,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 600,
                health: 100,
                damage: 40,
                bleed: 10,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: findMidValues(60,600),
                health: findMidValues(25,100),
                damage: findMidValues(10,40),
                bleed: findMidValues(5,10),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 60,
                health: 25,
                damage: 10,
                bleed: 5,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        allosaurus: {
            fullAdult: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 2800,
                health: 2800,
                damage: 300,
                bleed: 25,
            },
            midAdult: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(1850,2800),
                health: findMidValues(1050,2800),
                damage: findMidValues(75,300),
                bleed: findMidValues(25,25),
            },
            freshAdult: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1850,
                health: 1050,
                damage: 75,
                bleed: 25,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 1800,
                health: 1100,
                damage: 100,
                bleed: 25,
            },
            midJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: findMidValues(300,1800),
                health: findMidValues(200,1100),
                damage: findMidValues(50,100),
                bleed: findMidValues(25,25),
            },
            freshJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 300,
                health: 200,
                damage: 50,
                bleed: 25,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        ceratosaurus: {
            fullAdult: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 2250,
                health: 2250,
                damage: 350,
                bleed: 8,
            },
            midAdult: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(1900,2250),
                health: findMidValues(1900,2250),
                damage: findMidValues(225,350),
                bleed: findMidValues(8,8),
            },
            freshAdult: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1900,
                health: 1900,
                damage: 225,
                bleed: 8,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1900,
                health: 1900,
                damage: 140,
                bleed: 8,
            },
            midJuvie: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(150,1900),
                health: findMidValues(150,1900),
                damage: findMidValues(60,140),
                bleed: findMidValues(8,8),
            },
            freshJuvie: {
                bleedStandResist: 80,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 150,
                health: 150,
                damage: 60,
                bleed: 8,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        suchomimus: {
            fullAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 3600,
                health: 3600,
                damage: 350,
                bleed: 10,
            },
            midAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: findMidValues(2000,3600),
                health: findMidValues(1450,3600),
                damage: findMidValues(150,350),
                bleed: findMidValues(10,10),
            },
            freshAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 2000,
                health: 1450,
                damage: 150,
                bleed: 10,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 2000,
                health: 850,
                damage: 145,
                bleed: 5,
            },
            midJuvie: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: findMidValues(450,2000),
                health: findMidValues(350,850),
                damage: findMidValues(25,145),
                bleed: findMidValues(5,5),
            },
            freshJuvie: {
                bleedStandResist: 60,
                bleedSitResist: 25,
                bleedWalkResist: 80,
                bleedRunResist: 100,
                weight: 450,
                health: 350,
                damage: 25,
                bleed: 5,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        giganotosaurus: {
            fullAdult: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 6450,
                health: 6000,
                damage: 700,
                bleed: 50,
            },
            midAdult: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: findMidValues(3550,6450),
                health: findMidValues(4000,6000),
                damage: findMidValues(480,700),
                bleed: findMidValues(10,50),
            },
            freshAdult: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 3550,
                health: 4000,
                damage: 480,
                bleed: 10,
            },
            fullSub: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 3200,
                health: 4000,
                damage: 455,
                bleed: 10,
            },
            midSub: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: findMidValues(2200,3200),
                health: findMidValues(2000,4000),
                damage: findMidValues(150,455),
                bleed: findMidValues(5,10),
            },
            freshSub: {
                bleedStandResist: 30,
                bleedSitResist: 15,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 2200,
                health: 2000,
                damage: 150,
                bleed: 5,
            },
            fullJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 70,
                bleedRunResist: 100,
                weight: 2100,
                health: 2000,
                damage: 150,
                bleed: 5,
            },
            midJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 70,
                bleedRunResist: 100,
                weight: findMidValues(500,2100),
                health: findMidValues(250,2000),
                damage: findMidValues(50,150),
                bleed: findMidValues(2,5),
            },
            freshJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 70,
                bleedRunResist: 100,
                weight: 500,
                health: 250,
                damage: 50,
                bleed: 2,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        tyrannosaurus: {
            fullAdult: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 5800,
                health: 6500,
                damage: 1200,
                bleed: 10,
            },
            midAdult: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: findMidValues(3200,5800),
                health: findMidValues(4000,6500),
                damage: findMidValues(450,1200),
                bleed: findMidValues(10,10),
            },
            freshAdult: {
                bleedStandResist: 30,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 3200,
                health: 4000,
                damage: 450,
                bleed: 10,
            },
            fullSub: {
                bleedStandResist: 40,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 2875,
                health: 4000,
                damage: 450,
                bleed: 10,
            },
            midSub: {
                bleedStandResist: 40,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: findMidValues(1450,2875),
                health: findMidValues(2000,4000),
                damage: findMidValues(100,450),
                bleed: findMidValues(5,10),
            },
            freshSub: {
                bleedStandResist: 40,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 70,
                weight: 1450,
                health: 2000,
                damage: 100,
                bleed: 5,
            },
            fullJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 1400,
                health: 2000,
                damage: 100,
                bleed: 5,
            },
            midJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(200,1400),
                health: findMidValues(200,2000),
                damage: findMidValues(50,100),
                bleed: findMidValues(2,5),
            },
            freshJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 200,
                health: 200,
                damage: 50,
                bleed: 2,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },

//Vegetarians (lol)

        dryosaurus: {
            fullAdult: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 700,
                health: 500,
                damage: 20,
                bleed: 0,
            },
            midAdult: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(400,700),
                health: findMidValues(175,500),
                damage: findMidValues(10,20),
                bleed: findMidValues(0,0),
            },
            freshAdult: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 400,
                health: 175,
                damage: 10,
                bleed: 0,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 40,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 400,
                health: 50,
                damage: 10,
                bleed: 0,
            },
            midJuvie: {
                bleedStandResist: 40,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(100,400),
                health: findMidValues(7,50),
                damage: findMidValues(5,10),
                bleed: findMidValues(0,0),
            },
            freshJuvie: {
                bleedStandResist: 40,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 100,
                health: 7,
                damage: 5,
                bleed: 0,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        gallimimus: {
            fullAdult: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1000,
                health: 800,
                damage: 150,
                bleed: 0,
            },
            midAdult: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(720,1000),
                health: findMidValues(260,800),
                damage: findMidValues(20,150),
                bleed: findMidValues(0,0),
            },
            freshAdult: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 720,
                health: 260,
                damage: 20,
                bleed: 0,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 700,
                health: 148,
                damage: 18,
                bleed: 0,
            },
            midJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(80,700),
                health: findMidValues(260,148),
                damage: findMidValues(9,18),
                bleed: findMidValues(0,0),
            },
            freshJuvie: {
                bleedStandResist: 70,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 80,
                health: 260,
                damage: 9,
                bleed: 0,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        pachycephalosaurus: {
            fullAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1300,
                health: 1300,
                damage: 350,
                bleed: 0,
            },
            midAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(980,1300),
                health: findMidValues(1040,1300),
                damage: findMidValues(110,350),
                bleed: findMidValues(0,0),
            },
            freshAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 980,
                health: 1040,
                damage: 110,
                bleed: 0,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 750,
                health: 450,
                damage: 120,
                bleed: 0,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(350,750),
                health: findMidValues(175,450),
                damage: findMidValues(40,120),
                bleed: findMidValues(0,0),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 350,
                health: 175,
                damage: 40,
                bleed: 0,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        diabloceratops: {
            fullAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 3250,
                health: 3250,
                damage: 350,
                bleed: 25,
            },
            midAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(1650,3250),
                health: findMidValues(1700,3250),
                damage: findMidValues(175,350),
                bleed: findMidValues(25,25),
            },
            freshAdult: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 1650,
                health: 1700,
                damage: 175,
                bleed: 25,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 1850,
                health: 950,
                damage: 115,
                bleed: 25,
            },
            midJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(400,1850),
                health: findMidValues(350,950),
                damage: findMidValues(60,115),
                bleed: findMidValues(25,25),
            },
            freshJuvie: {
                bleedStandResist: 30,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 400,
                health: 350,
                damage: 60,
                bleed: 25,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        maiasaura: {
            fullAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 2868,
                health: 2868,
                damage: 175,
                bleed: 0,
            },
            midAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: findMidValues(960,2868),
                health: findMidValues(1000,2868),
                damage: findMidValues(100,175),
                bleed: findMidValues(0,0),
            },
            freshAdult: {
                bleedStandResist: 25,
                bleedSitResist: 20,
                bleedWalkResist: 100,
                bleedRunResist: 200,
                weight: 960,
                health: 1000,
                damage: 100,
                bleed: 0,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 950,
                health: 748,
                damage: 60,
                bleed: 0,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(300,950),
                health: findMidValues(50,748),
                damage: findMidValues(30,60),
                bleed: findMidValues(0,0),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 300,
                health: 50,
                damage: 30,
                bleed: 0,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        parasaurolophus: {
            fullAdult: {
                bleedStandResist: 30,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 3600,
                health: 3600,
                damage: 250,
                bleed: 0,
                special: 1100,
                specialBleed: 0,
            },
            midAdult: {
                bleedStandResist: 30,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: findMidValues(2000,3600),
                health: findMidValues(2000,3600),
                damage: findMidValues(115,250),
                bleed: findMidValues(0,0),
                special: findMidValues(1100,1100),
                specialBleed: findMidValues(0,0),
            },
            freshAdult: {
                bleedStandResist: 30,
                bleedSitResist: 20,
                bleedWalkResist: 50,
                bleedRunResist: 80,
                weight: 2000,
                health: 2000,
                damage: 115,
                bleed: 0,
                special: 1100,
                specialBleed: 0,
            },
            fullSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            midSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: findMidValues(0,0),
                health: findMidValues(0,0),
                damage: findMidValues(0,0),
                bleed: findMidValues(0,0),
            },
            freshSub: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 1800,
                health: 1750,
                damage: 80,
                bleed: 0,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(350,1800),
                health: findMidValues(50,1750),
                damage: findMidValues(40,80),
                bleed: findMidValues(0,0),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 350,
                health: 50,
                damage: 40,
                bleed: 0,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
        triceratops: {
            fullAdult: {
                bleedStandResist: 40,
                bleedSitResist: 20,
                bleedWalkResist: 90,
                bleedRunResist: 180,
                weight: 8300,
                health: 8200,
                damage: 360,
                bleed: 20,
                special: 800,
                specialBleed: 30,
            },
            midAdult: {
                bleedStandResist: 40,
                bleedSitResist: 20,
                bleedWalkResist: 90,
                bleedRunResist: 180,
                weight: findMidValues(4150,8300),
                health: findMidValues(4000,8200),
                damage: findMidValues(160,360),
                bleed: findMidValues(20,20),
                special: findMidValues(800,800),
                specialBleed: findMidValues(30,30),
            },
            freshAdult: {
                bleedStandResist: 40,
                bleedSitResist: 20,
                bleedWalkResist: 90,
                bleedRunResist: 180,
                weight: 4150,
                health: 4000,
                damage: 160,
                bleed: 20,
                special: 800,
                specialBleed: 30,
            },
            fullSub: {
                bleedStandResist: 50,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 4100,
                health: 3570,
                damage: 200,
                bleed: 20,
            },
            midSub: {
                bleedStandResist: 50,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: findMidValues(2000,4100),
                health: findMidValues(1250,3570),
                damage: findMidValues(120,200),
                bleed: findMidValues(20,20),
            },
            freshSub: {
                bleedStandResist: 50,
                bleedSitResist: 10,
                bleedWalkResist: 50,
                bleedRunResist: 100,
                weight: 2000,
                health: 1250,
                damage: 120,
                bleed: 20,
            },
            fullJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 1850,
                health: 760,
                damage: 120,
                bleed: 20,
            },
            midJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: findMidValues(420,1850),
                health: findMidValues(400,760),
                damage: findMidValues(60,120),
                bleed: findMidValues(20,20),
            },
            freshJuvie: {
                bleedStandResist: 50,
                bleedSitResist: 25,
                bleedWalkResist: 100,
                bleedRunResist: 100,
                weight: 420,
                health: 400,
                damage: 60,
                bleed: 20,
            },
            custom: {
                bleedStandResist: 0,
                bleedSitResist: 0,
                bleedWalkResist: 0,
                bleedRunResist: 0,
                weight: 0,
                health: 0,
                damage: 0,
                bleed: 0,
            },
        },
    }
    function findMidValues(min,max){
        total = min + max
        return total/2
    }

    let dino1 = ""
    let dino2 = ""
    let dino1Text = ""
    let dino2Text = ""
    let growth1 = "fullAdult"
    let growth2 = "fullAdult"
    let growthText1 = "Full Adult"
    let growthText2 = "Full Adult"

    document.getElementById("calculateBtn").addEventListener("click", calculateF)

    document.getElementById("carnotaurusBtn1").addEventListener("click", carnotaurus1F)
    document.getElementById("dilophosaurusBtn1").addEventListener("click", dilophosaurus1F)
    document.getElementById("utahraptorBtn1").addEventListener("click", utahraptor1F)
    document.getElementById("allosaurusBtn1").addEventListener("click", allosaurus1F)
    document.getElementById("ceratosaurusBtn1").addEventListener("click", ceratosaurus1F)
    document.getElementById("suchomimusBtn1").addEventListener("click", suchomimus1F)
    document.getElementById("giganotosaurusBtn1").addEventListener("click", giganotosaurus1F)
    document.getElementById("tyrannosaurusBtn1").addEventListener("click", tyrannosaurus1F)
    document.getElementById("dryosaurusBtn1").addEventListener("click", dryosaurus1F)
    document.getElementById("gallimimusBtn1").addEventListener("click", gallimimus1F)
    document.getElementById("pachycephalosaurusBtn1").addEventListener("click", pachycephalosaurus1F)
    document.getElementById("diabloceratopsBtn1").addEventListener("click", diabloceratops1F)
    document.getElementById("maiasauraBtn1").addEventListener("click", maiasaura1F)
    document.getElementById("parasaurolophusBtn1").addEventListener("click", parasaurolophus1F)
    document.getElementById("triceratopsBtn1").addEventListener("click", triceratops1F)


    document.getElementById("carnotaurusBtn2").addEventListener("click", carnotaurus2F)
    document.getElementById("dilophosaurusBtn2").addEventListener("click", dilophosaurus2F)
    document.getElementById("utahraptorBtn2").addEventListener("click", utahraptor2F)
    document.getElementById("allosaurusBtn2").addEventListener("click", allosaurus2F)
    document.getElementById("ceratosaurusBtn2").addEventListener("click", ceratosaurus2F)
    document.getElementById("suchomimusBtn2").addEventListener("click", suchomimus2F)
    document.getElementById("giganotosaurusBtn2").addEventListener("click", giganotosaurus2F)
    document.getElementById("tyrannosaurusBtn2").addEventListener("click", tyrannosaurus2F)
    document.getElementById("dryosaurusBtn2").addEventListener("click", dryosaurus2F)
    document.getElementById("gallimimusBtn2").addEventListener("click", gallimimus2F)
    document.getElementById("pachycephalosaurusBtn2").addEventListener("click", pachycephalosaurus2F)
    document.getElementById("diabloceratopsBtn2").addEventListener("click", diabloceratops2F)
    document.getElementById("maiasauraBtn2").addEventListener("click", maiasaura2F)
    document.getElementById("parasaurolophusBtn2").addEventListener("click", parasaurolophus2F)
    document.getElementById("triceratopsBtn2").addEventListener("click", triceratops2F)


    document.getElementById("freshJuvieBtn1").addEventListener("click", freshJuvie1F)
    document.getElementById("midJuvieBtn1").addEventListener("click", midJuvie1F)
    document.getElementById("fullJuvieBtn1").addEventListener("click", fullJuvie1F)
    document.getElementById("freshSubBtn1").addEventListener("click", freshSub1F)
    document.getElementById("midSubBtn1").addEventListener("click", midSub1F)
    document.getElementById("fullSubBtn1").addEventListener("click", fullSub1F)
    document.getElementById("freshAdultBtn1").addEventListener("click", freshAdult1F)
    document.getElementById("midAdultBtn1").addEventListener("click", midAdult1F)
    document.getElementById("fullAdultBtn1").addEventListener("click", fullAdult1F)
    document.getElementById("customBtn1").addEventListener("click", custom1F)
    document.getElementById("freshJuvieBtn2").addEventListener("click", freshJuvie2F)
    document.getElementById("midJuvieBtn2").addEventListener("click", midJuvie2F)
    document.getElementById("fullJuvieBtn2").addEventListener("click", fullJuvie2F)
    document.getElementById("freshSubBtn2").addEventListener("click", freshSub2F)
    document.getElementById("midSubBtn2").addEventListener("click", midSub2F)
    document.getElementById("fullSubBtn2").addEventListener("click", fullSub2F)
    document.getElementById("freshAdultBtn2").addEventListener("click", freshAdult2F)
    document.getElementById("midAdultBtn2").addEventListener("click", midAdult2F)
    document.getElementById("fullAdultBtn2").addEventListener("click", fullAdult2F)
    document.getElementById("customBtn2").addEventListener("click", custom2F)

    function hideSubBtns1(){
        document.getElementById("freshSubBtn1").style.display = "none"
        document.getElementById("midSubBtn1").style.display = "none"
        document.getElementById("fullSubBtn1").style.display = "none"
    }

    function hideSubBtns2(){
        document.getElementById("freshSubBtn2").style.display = "none"
        document.getElementById("midSubBtn2").style.display = "none"
        document.getElementById("fullSubBtn2").style.display = "none"
    }

    hideAllGrowthButtons1()
    function hideAllGrowthButtons1(){
        document.getElementById("freshJuvieBtn1").style.display = "none"
        document.getElementById("midJuvieBtn1").style.display = "none"
        document.getElementById("fullJuvieBtn1").style.display = "none"
        document.getElementById("freshSubBtn1").style.display = "none"
        document.getElementById("midSubBtn1").style.display = "none"
        document.getElementById("fullSubBtn1").style.display = "none"
        document.getElementById("freshAdultBtn1").style.display = "none"
        document.getElementById("midAdultBtn1").style.display = "none"
        document.getElementById("fullAdultBtn1").style.display = "none"
    }
    hideAllGrowthButtons2()
    function hideAllGrowthButtons2(){
        document.getElementById("freshJuvieBtn2").style.display = "none"
        document.getElementById("midJuvieBtn2").style.display = "none"
        document.getElementById("fullJuvieBtn2").style.display = "none"
        document.getElementById("freshSubBtn2").style.display = "none"
        document.getElementById("midSubBtn2").style.display = "none"
        document.getElementById("fullSubBtn2").style.display = "none"
        document.getElementById("freshAdultBtn2").style.display = "none"
        document.getElementById("midAdultBtn2").style.display = "none"
        document.getElementById("fullAdultBtn2").style.display = "none"
    }

    function showAllGrowthButtons1(){
        document.getElementById("freshJuvieBtn1").style.display = "block"
        document.getElementById("midJuvieBtn1").style.display = "block"
        document.getElementById("fullJuvieBtn1").style.display = "block"
        document.getElementById("freshSubBtn1").style.display = "block"
        document.getElementById("midSubBtn1").style.display = "block"
        document.getElementById("fullSubBtn1").style.display = "block"
        document.getElementById("freshAdultBtn1").style.display = "block"
        document.getElementById("midAdultBtn1").style.display = "block"
        document.getElementById("fullAdultBtn1").style.display = "block"
    }

    function showAllGrowthButtons2(){
        document.getElementById("freshJuvieBtn2").style.display = "block"
        document.getElementById("midJuvieBtn2").style.display = "block"
        document.getElementById("fullJuvieBtn2").style.display = "block"
        document.getElementById("freshSubBtn2").style.display = "block"
        document.getElementById("midSubBtn2").style.display = "block"
        document.getElementById("fullSubBtn2").style.display = "block"
        document.getElementById("freshAdultBtn2").style.display = "block"
        document.getElementById("midAdultBtn2").style.display = "block"
        document.getElementById("fullAdultBtn2").style.display = "block"
    }

    function dinoAndGrowthText1(){
        document.getElementById("dino1web").innerHTML = dino1Text
        document.getElementById("growth1web").innerHTML = growthText1
    }

    function dinoSelectActions1(){
        showAllGrowthButtons1()
        dinoAndGrowthText1()
        updateCustomValues1()
    }

    function carnotaurus1F() {
        dino1 = "carnotaurus"
        dino1Text = "Carnotaurus"
        dinoSelectActions1()
        hideSubBtns1()

    }

    function dilophosaurus1F() {
        dino1 = "dilophosaurus"
        dino1Text = "Dilophosaurus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function utahraptor1F() {
        dino1 = "utahraptor"
        dino1Text = "Utahraptor"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function allosaurus1F() {
        dino1 = "allosaurus"
        dino1Text = "Allosaurus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function ceratosaurus1F() {
        dino1 = "ceratosaurus"
        dino1Text = "Ceratosaurus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function suchomimus1F() {
        dino1 = "suchomimus"
        dino1Text = "Suchomimus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function giganotosaurus1F() {
        dino1 = "giganotosaurus"
        dino1Text = "Giganotosaurus"
        dinoSelectActions1()
    }

    function tyrannosaurus1F() {
        dino1 = "tyrannosaurus"
        dino1Text = "Tyrannosaurus"
        dinoSelectActions1()
    }

    function dryosaurus1F() {
        dino1 = "dryosaurus"
        dino1Text = "Dryosaurus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function gallimimus1F() {
        dino1 = "gallimimus"
        dino1Text = "Gallimimus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function pachycephalosaurus1F() {
        dino1 = "pachycephalosaurus"
        dino1Text = "Pachycephalosaurus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function diabloceratops1F() {
        dino1 = "diabloceratops"
        dino1Text = "Diabloceratops"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function maiasaura1F() {
        dino1 = "maiasaura"
        dino1Text = "Maiasaura"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function parasaurolophus1F() {
        dino1 = "parasaurolophus"
        dino1Text = "Parasaurolophus"
        dinoSelectActions1()
        hideSubBtns1()
    }

    function triceratops1F() {
        dino1 = "triceratops"
        dino1Text = "Triceratops"
        dinoSelectActions1()
    }

    function dinoAndGrowthText2(){
        document.getElementById("dino2web").innerHTML = dino2Text
        document.getElementById("growth2web").innerHTML = growthText2
    }

    function dinoSelectActions2(){
        showAllGrowthButtons2()
        dinoAndGrowthText2()
        updateCustomValues2()
    }

    function carnotaurus2F() {
        dino2 = "carnotaurus"
        dino2Text = "Carnotaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function dilophosaurus2F() {
        dino2 = "dilophosaurus"
        dino2Text = "Dilophosaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function utahraptor2F() {
        dino2 = "utahraptor"
        dino2Text = "Utahraptor"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function allosaurus2F() {
        dino2 = "allosaurus"
        dino2Text = "Allosaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function ceratosaurus2F() {
        dino2 = "ceratosaurus"
        dino2Text = "Ceratosaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function suchomimus2F() {
        dino2 = "suchomimus"
        dino2Text = "Suchomimus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function giganotosaurus2F() {
        dino2 = "giganotosaurus"
        dino2Text = "Giganotosaurus"
        dinoSelectActions2()
    }

    function tyrannosaurus2F() {
        dino2 = "tyrannosaurus"
        dino2Text = "Tyrannosaurus"
        dinoSelectActions2()
    }

    function dryosaurus2F() {
        dino2 = "dryosaurus"
        dino2Text = "Dryosaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function gallimimus2F() {
        dino2 = "gallimimus"
        dino2Text = "Gallimimus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function pachycephalosaurus2F() {
        dino2 = "pachycephalosaurus"
        dino2Text = "Pachycephalosaurus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function diabloceratops2F() {
        dino2 = "diabloceratops"
        dino2Text = "Diabloceratops"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function maiasaura2F() {
        dino2 = "maiasaura"
        dino2Text = "Maiasaura"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function parasaurolophus2F() {
        dino2 = "parasaurolophus"
        dino2Text = "Parasaurolophus"
        dinoSelectActions2()
        hideSubBtns2()
    }

    function triceratops2F() {
        dino2 = "triceratops"
        dino2Text = "Triceratops"
        dinoSelectActions2()
    }

    function updateCustomValues1() {
        dinos[dino1]["custom"].bleedStandResist = dinos[dino1][growth1].bleedStandResist
        dinos[dino1]["custom"].bleedSitResist = dinos[dino1][growth1].bleedSitResist
        dinos[dino1]["custom"].bleedWalkResist = dinos[dino1][growth1].bleedWalkResist
        dinos[dino1]["custom"].bleedRunResist = dinos[dino1][growth1].bleedRunResist
        document.getElementById("customWeight1").value = dinos[dino1][growth1].weight
        document.getElementById("customHealth1").value = dinos[dino1][growth1].health
        document.getElementById("customDamage1").value = dinos[dino1][growth1].damage
        document.getElementById("customBleed1").value = dinos[dino1][growth1].bleed
    }

    function growthSelectActions1(){
        document.getElementById("growth1web").innerHTML = growthText1
        updateCustomValues1()
    }

    function freshJuvie1F() {
        growth1 = "freshJuvie"
        growthText1 = "Fresh Juvenile"
        growthSelectActions1()
    }

    function midJuvie1F() {
        growth1 = "midJuvie"
        growthText1 = "Mid Juvenile"
        growthSelectActions1()
    }

    function fullJuvie1F() {
        growth1 = "fullJuvie"
        growthText1 = "Full Juvenile"
        growthSelectActions1()
    }

    function freshSub1F() {
        growth1 = "freshSub"
        growthText1 = "Fresh Sub-Adult"
        growthSelectActions1()
    }

    function midSub1F() {
        growth1 = "midSub"
        growthText1 = "Mid Sub-Adult"
        growthSelectActions1()
    }

    function fullSub1F() {
        growth1 = "fullSub"
        growthText1 = "Full Sub-Adult"
        growthSelectActions1()
    }

    function freshAdult1F() {
        growth1 = "freshAdult"
        growthText1 = "Fresh Adult"
        growthSelectActions1()
    }

    function midAdult1F() {
        growth1 = "midAdult"
        growthText1 = "Mid Adult"
        growthSelectActions1()
    }

    function fullAdult1F() {
        growth1 = "fullAdult"
        growthText1 = "Full Adult"
        growthSelectActions1()
    }

    function redefineCustom1() {
        dinos[dino1]["custom"].weight = document.getElementById("customWeight1").value
        dinos[dino1]["custom"].health = document.getElementById("customHealth1").value
        dinos[dino1]["custom"].damage = document.getElementById("customDamage1").value
        dinos[dino1]["custom"].bleed = document.getElementById("customBleed1").value
    }

    function custom1F() {
        redefineCustom1()
        growth1 = "custom"
        growthText1 = "Custom"
        document.getElementById("growth1web").innerHTML = growthText1
    }

    function updateCustomValues2() {
        dinos[dino2]["custom"].bleedStandResist = dinos[dino2][growth2].bleedStandResist
        dinos[dino2]["custom"].bleedSitResist = dinos[dino2][growth2].bleedSitResist
        dinos[dino2]["custom"].bleedWalkResist = dinos[dino2][growth2].bleedWalkResist
        dinos[dino2]["custom"].bleedRunResist = dinos[dino2][growth2].bleedRunResist
        document.getElementById("customWeight2").value = dinos[dino2][growth2].weight
        document.getElementById("customHealth2").value = dinos[dino2][growth2].health
        document.getElementById("customDamage2").value = dinos[dino2][growth2].damage
        document.getElementById("customBleed2").value = dinos[dino2][growth2].bleed
    }

    function growthSelectActions2(){
        document.getElementById("growth2web").innerHTML = growthText2
        updateCustomValues2()
    }

    function freshJuvie2F() {
        growth2 = "freshJuvie"
        growthText2 = "Fresh Juvenile"
        growthSelectActions2()
    }

    function midJuvie2F() {
        growth2 = "midJuvie"
        growthText2 = "Mid Juvenile"
        growthSelectActions2()
    }

    function fullJuvie2F() {
        growth2 = "fullJuvie"
        growthText2 = "Full Juvenile"
        growthSelectActions2()
    }

    function freshSub2F() {
        growth2 = "freshSub"
        growthText2 = "Fresh Sub-Adult"
        growthSelectActions2()
    }

    function midSub2F() {
        growth2 = "midSub"
        growthText2 = "Mid Sub-Adult"
        growthSelectActions2()
    }

    function fullSub2F() {
        growth2 = "fullSub"
        growthText2 = "Full Sub-Adult"
        growthSelectActions2()
    }

    function freshAdult2F() {
        growth2 = "freshAdult"
        growthText2 = "Fresh Adult"
        growthSelectActions2()
    }

    function midAdult2F() {
        growth2 = "midAdult"
        growthText2 = "Mid Adult"
        growthSelectActions2()
    }

    function fullAdult2F() {
        growth2 = "fullAdult"
        growthText2 = "Full Adult"
        growthSelectActions2()
    }

    function redefineCustom2() {
        dinos[dino2]["custom"].weight = document.getElementById("customWeight2").value
        dinos[dino2]["custom"].health = document.getElementById("customHealth2").value
        dinos[dino2]["custom"].damage = document.getElementById("customDamage2").value
        dinos[dino2]["custom"].bleed = document.getElementById("customBleed2").value
    }

    function custom2F() {
        redefineCustom2()
        growth2 = "custom"
        growthText2 = "Custom"
        document.getElementById("growth2web").innerHTML = growthText2
    }

    function calculateF() {

        if (dino1 == "") {
            alert("First dinosaur is not defined")
        }
        if (dino2 == "") {
            alert("Second dinosaur is not defined")
        }
        updateCustomValues1()
        updateCustomValues2()
        redefineCustom1()
        redefineCustom2()

        let actualDamage1 = 0
        let actualStandBleed1 = 0
        let numOfBites1 = 0
        let actualDamage2 = 0
        let actualStandBleed2 = 0
        let numOfBites2 = 0

        function damageCalc1() {
            a = dinos[dino1][growth1].damage
            b = dinos[dino1][growth1].weight
            c = dinos[dino2][growth2].weight
            actualDamage1 = Math.round(a * (b / c))
        }

        function specialCalc1() {
            a = dinos[dino1][growth1].special
            b = dinos[dino1][growth1].weight
            c = dinos[dino2][growth2].weight
            actualSpecialDamage1 = Math.round(a * (b / c))
        }
        function bleedCalc1() {
            a = dinos[dino1][growth1].bleed
            b = dinos[dino1][growth1].weight
            c = dinos[dino2][growth2].weight
            actualStandBleed1 = ((dinos[dino2][growth2].bleedStandResist/100)*(a * (b / c))).toFixed(1)
            actualSitBleed1 = ((dinos[dino2][growth2].bleedSitResist/100)*(a * (b / c))).toFixed(1)
            actualWalkBleed1 = ((dinos[dino2][growth2].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
            actualRunBleed1 = ((dinos[dino2][growth2].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
        }

        function specialBleedCalc1() {
            a = dinos[dino1][growth1].specialBleed
            b = dinos[dino1][growth1].weight
            c = dinos[dino2][growth2].weight
            actualSpecialStandBleed1 = ((dinos[dino2][growth2].bleedStandResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialSitBleed1 = ((dinos[dino2][growth2].bleedSitResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialWalkBleed1 = ((dinos[dino2][growth2].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialRunBleed1 = ((dinos[dino2][growth2].bleedRunResist/100)*(a * (b / c))).toFixed(1)
        }

        function bitesCalc1() {
            numOfBites1 = Math.ceil((dinos[dino2][growth2].health) / actualDamage1)
        }

        function damageCalc2() {
            a = dinos[dino2][growth2].damage
            b = dinos[dino2][growth2].weight
            c = dinos[dino1][growth1].weight
            actualDamage2 = Math.round(a * (b / c))
        }

        function specialCalc2() {
            a = dinos[dino2][growth2].special
            b = dinos[dino2][growth2].weight
            c = dinos[dino1][growth1].weight
            actualSpecialDamage2 = Math.round(a * (b / c))
        }
        function bleedCalc2() {
            a = dinos[dino2][growth2].bleed
            b = dinos[dino2][growth2].weight
            c = dinos[dino1][growth1].weight
            actualStandBleed2 = ((dinos[dino1][growth1].bleedStandResist/100)*(a * (b / c))).toFixed(1)
            actualSitBleed2 = ((dinos[dino1][growth1].bleedSitResist/100)*(a * (b / c))).toFixed(1)
            actualWalkBleed2 = ((dinos[dino1][growth1].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
            actualRunBleed2 = ((dinos[dino1][growth1].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
        }

        function specialBleedCalc2() {
            a = dinos[dino2][growth2].specialBleed
            b = dinos[dino2][growth2].weight
            c = dinos[dino1][growth1].weight
            actualSpecialStandBleed2 = ((dinos[dino1][growth1].bleedStandResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialSitBleed2 = ((dinos[dino1][growth1].bleedSitResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialWalkBleed2 = ((dinos[dino1][growth1].bleedWalkResist/100)*(a * (b / c))).toFixed(1)
            actualSpecialRunBleed2 = ((dinos[dino1][growth1].bleedRunResist/100)*(a * (b / c))).toFixed(1)
        }

        function bitesCalc2() {
            numOfBites2 = Math.ceil((dinos[dino1][growth1].health) / actualDamage2)
        }

        bleedCalc1()
        specialBleedCalc1()
        damageCalc1()
        specialCalc1()
        bitesCalc1()

        bleedCalc2()
        specialBleedCalc2()
        damageCalc2()
        specialCalc2()
        bitesCalc2()
        /*
          document.getElementById("dino1web").innerHTML = dino1Text
          document.getElementById("growth1web").innerHTML = growthText1
          document.getElementById("dino2web").innerHTML = dino1Text
          document.getElementById("growth2web").innerHTML = growthText1
          document.getElementById("numOfBites1web").innerHTML = numOfBites1
          document.getElementById("numOfBites2web").innerHTML = numOfBites2
          document.getElementById("actualDamage1web").innerHTML = actualDamage1
          document.getElementById("actualDamage2web").innerHTML = actualDamage2
          document.getElementById("actualSitBleed1web").innerHTML = actualSitBleed1
          document.getElementById("actualSitBleed2web").innerHTML = actualSitBleed2
          document.getElementById("actualStandBleed1web").innerHTML = actualStandBleed1
          document.getElementById("actualStandBleed2web").innerHTML = actualStandBleed2
          document.getElementById("actualWalkBleed1web").innerHTML = actualWalkBleed1
          document.getElementById("actualWalkBleed2web").innerHTML = actualWalkBleed2
          document.getElementById("actualSpecialDamage1web").innerHTML = actualSpecialDamage1
          document.getElementById("actualSpecialDamage2web").innerHTML = actualSpecialDamage2
          document.getElementById("actualSpecialSitBleed1web").innerHTML = actualSpecialSitBleed1
          document.getElementById("actualSpecialSitBleed2web").innerHTML = actualSpecialSitBleed2
          document.getElementById("actualSpecialStandBleed1web").innerHTML = actualSpecialStandBleed1
          document.getElementById("actualSpecialStandBleed2web").innerHTML = actualSpecialStandBleed2
          document.getElementById("actualSpecialWalkBleed1web").innerHTML = actualSpecialWalkBleed1
          document.getElementById("actualSpecialWalkBleed2web").innerHTML = actualSpecialWalkBleed2
        */
        document.getElementById("vsLine1").innerHTML = dino1Text + " " + growthText1 + " VS " + dino2Text + " " + growthText2 + ":"
        document.getElementById("dmgLine1").innerHTML = dino1Text + " " + growthText1 + " does " + actualDamage1 + " damage to " + dino2Text + " " + growthText2 + " each bite."
        document.getElementById("bleedLine1").innerHTML = dino1Text + " " + growthText1 + " does " + actualStandBleed1 + " Bleed damage to " + dino2Text + " " + growthText2 + " each bite. ("+actualSitBleed1 +" Sitting, "+actualStandBleed1+" Standing, "+actualWalkBleed1+" walking)"
        document.getElementById("bitesLine1").innerHTML = dino1Text + " " + growthText1 + " needs " + numOfBites1 + " bite(s) to kill a " + dino2Text + " " + growthText2 + " not counting bleed."
        document.getElementById("vsLine2").innerHTML = dino2Text + " " + growthText2 + " VS " + dino1Text + " " + growthText1 + ":"
        document.getElementById("dmgLine2").innerHTML = dino2Text + " " + growthText2 + " does " + actualDamage2 + " damage to " + dino1Text + " " + growthText1 + " each bite."
        document.getElementById("bleedLine2").innerHTML = dino2Text + " " + growthText2 + " does " + actualStandBleed2 + " Bleed damage to " + dino1Text + " " + growthText1 + " each bite. ("+actualSitBleed2 +" Sitting, "+actualStandBleed2+" Standing, "+actualWalkBleed2+" walking)"
        document.getElementById("bitesLine2").innerHTML = dino2Text + " " + growthText2 + " needs " + numOfBites2 + " bite(s) to kill a " + dino1Text + " " + growthText1 + " not counting bleed."
        if ((dinos[dino1][growth1].special > 0) && (growth1 == "fullAdult" || growth1 == "midAdult" || growth1 == "freshAdult")) {
            document.getElementById("special1").innerHTML = dino1Text + " " + growthText1 + " can also inflict " + actualSpecialDamage1 + " damage and " + actualSpecialStandBleed1 + " bleed damage to " + dino2Text + " " + growthText2 + " using its special attack. ("+actualSpecialSitBleed1 +" Sitting, "+actualSpecialStandBleed1+" Standing, "+actualSpecialWalkBleed1+" walking)"
        } else {
            document.getElementById("special1").innerHTML = ""
        }
        if ((dinos[dino2][growth2].special > 0) && (growth2 == "fullAdult" || growth2 == "midAdult" || growth2 == "freshAdult")) {
            document.getElementById("special2").innerHTML = dino2Text + " " + growthText2 + " can also inflict " + actualSpecialDamage2 + " damage and " + actualSpecialStandBleed2 + " bleed damage to " + dino1Text + " " + growthText1 + " using its special attack. ("+actualSpecialSitBleed2 +" Sitting, "+actualSpecialStandBleed2+" Standing, "+actualSpecialWalkBleed2+" walking)"
        } else {
            document.getElementById("special2").innerHTML = ""
        }
    }
}