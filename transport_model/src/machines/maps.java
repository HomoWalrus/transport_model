package machines;

public class maps {
	
	
	public static void mapinfo( int map ) {

      if ( map == 1 ) { 
    	  global.kolPer = 51 ; 
    	  global.kolDor = 57 ;
    	  
    	  for (int i = 0 ; i < global.kolPer ; i++ ) {
    		  global.koordPer[ i ] = new koord() ;
    	  }
    	  for (int i = 0 ; i < global.kolDor ; i++ ) {
    		  global.roads[ i ] = new road() ;
    	  }
    	  
        global.koordPer[ 0 ].setkoord( 2 , 38 ) ;	//map1 koordinati precrestkov
        global.koordPer[ 1 ].setkoord( 29 , 312 ) ;
        global.koordPer[ 2 ].setkoord( 33, 47 ) ;
        global.koordPer[ 3 ].setkoord( 117, 34 ) ;
        global.koordPer[ 4 ].setkoord( 118, 110 ) ;
        global.koordPer[ 5 ].setkoord( 170 , 118 ) ;
        global.koordPer[ 6 ].setkoord( 169 , 282 ) ;
        global.koordPer[ 7 ].setkoord( 230 , 294 ) ;
        global.koordPer[ 8 ].setkoord( 232 , 318 ) ;
        global.koordPer[ 9 ].setkoord( 254 , 339 ) ;
        global.koordPer[ 10 ].setkoord( 255 , 377 ) ;
        global.koordPer[ 11 ].setkoord( 286 , 118 ) ;
        global.koordPer[ 12 ].setkoord( 283 , 8 ) ;
        global.koordPer[ 13 ].setkoord( 380 , 120 ) ;
        global.koordPer[ 14 ].setkoord( 380 , 6 ) ;
        global.koordPer[ 15 ].setkoord( 534 , 119 ) ;
        global.koordPer[ 16 ].setkoord( 539 , 55 ) ;
        global.koordPer[ 17 ].setkoord( 573 , 51 ) ;
        global.koordPer[ 18 ].setkoord( 666 , 118 ) ;
        global.koordPer[ 19 ].setkoord( 674 , 5 ) ;
        global.koordPer[ 20 ].setkoord( 735 , 117 ) ;
        global.koordPer[ 21 ].setkoord( 794 , 118 ) ;
        global.koordPer[ 22 ].setkoord( 739 , 269 ) ;
        global.koordPer[ 23 ].setkoord( 796 , 272 ) ;
        global.koordPer[ 24 ].setkoord( 664 , 271 ) ;
        global.koordPer[ 25 ].setkoord( 665 , 195 ) ;
        global.koordPer[ 26 ].setkoord( 382 , 195 ) ;
        global.koordPer[ 27 ].setkoord( 387 , 325 ) ;
        global.koordPer[ 28 ].setkoord( 529 , 325 ) ;
        global.koordPer[ 29 ].setkoord( 595 , 325 ) ;
        global.koordPer[ 30 ].setkoord( 530 , 386 ) ;
        global.koordPer[ 31 ].setkoord( 499 , 389 ) ;
        global.koordPer[ 32 ].setkoord( 496 , 410 ) ;
        global.koordPer[ 33 ].setkoord( 661 , 388 ) ;
        global.koordPer[ 34 ].setkoord( 730 , 325 ) ;
        global.koordPer[ 35 ].setkoord( 795 , 327 ) ;
        global.koordPer[ 36 ].setkoord( 732 , 393 ) ;
        global.koordPer[ 37 ].setkoord( 794 , 391 ) ;
        global.koordPer[ 38 ].setkoord( 735 , 485 ) ;
        global.koordPer[ 39 ].setkoord( 795 , 488 ) ;
        global.koordPer[ 40 ].setkoord( 662 , 556 ) ;
        global.koordPer[ 41 ].setkoord( 731 , 558 ) ;
        global.koordPer[ 42 ].setkoord( 734 , 525 ) ;
        global.koordPer[ 43 ].setkoord( 794 , 558 ) ;
        global.koordPer[ 44 ].setkoord( 534 , 556 ) ;
        global.koordPer[ 45 ].setkoord( 381 , 556 ) ;
        global.koordPer[ 46 ].setkoord( 116 , 563 ) ;
        global.koordPer[ 47 ].setkoord( 115 , 473 ) ;
        global.koordPer[ 48 ].setkoord( 43 , 561 ) ;
        global.koordPer[ 49 ].setkoord( 5 , 601 ) ;
        global.koordPer[ 50 ].setkoord( 34 , 620 ) ;
               
      
          
        global.roads[ 0 ].setroad(0 , 2 , 1 , 1 ) ; //map1roads
        global.roads[ 1 ].setroad( 1 , 2 , 1 , 1 ) ;
        global.roads[ 2 ].setroad( 2 , 3 , 1 , 1 ) ;
        global.roads[ 3 ].setroad( 3 , 4 , 1 , 1 ) ;
        global.roads[ 4 ].setroad( 4 , 5 , 1 , 1 ) ;
        global.roads[ 5 ].setroad( 4 , 47 , 1 , 1 ) ;
        global.roads[ 6 ].setroad( 5 , 6 , 1 , 1 ) ;
        global.roads[ 7 ].setroad( 5 , 11 , 1 , 1 ) ;
        global.roads[ 8 ].setroad( 6 , 7 , 1 , 1 ) ;
        global.roads[ 9 ].setroad( 7 , 8 , 1 , 1 ) ;
        global.roads[ 10 ].setroad( 8 , 9 , 1 , 1 ) ;
        global.roads[ 11 ].setroad( 9 , 10 , 1 , 1 ) ;
        global.roads[ 12 ].setroad( 11 , 12 , 1 , 1 ) ;
        global.roads[ 13 ].setroad( 11 , 13 , 1 , 1 ) ;
        global.roads[ 14 ].setroad( 13 , 14 , 1 , 1 ) ;
        global.roads[ 15 ].setroad( 13 , 15 , 1 , 1 ) ;
        global.roads[ 16 ].setroad( 13 , 26 , 1 , 1 ) ;
        global.roads[ 17 ].setroad( 15 , 16 , 1 , 1 ) ;
        global.roads[ 18 ].setroad( 15 , 18 , 1 , 1 ) ;
        global.roads[ 19 ].setroad( 16 , 17 , 1 , 1 ) ;
        global.roads[ 20 ].setroad( 18 , 19 , 1 , 1 ) ;
        global.roads[ 21 ].setroad( 18 , 20 , 1 , 1 ) ;
        global.roads[ 22 ].setroad( 18 , 25 , 1 , 1 ) ;
        global.roads[ 23 ].setroad( 20 , 21 , 1 , 1 ) ;
        global.roads[ 24 ].setroad( 20 , 22 , 1 , 1 ) ;
        global.roads[ 25 ].setroad( 22 , 23 , 1 , 1 ) ;
        global.roads[ 26 ].setroad( 22 , 24 , 1 , 1 ) ;
        global.roads[ 27 ].setroad( 24 , 25 , 1 , 1 ) ;
        global.roads[ 28 ].setroad( 24 , 33 , 1 , 1 ) ;
        global.roads[ 29 ].setroad( 24 , 34 , 1 , 1 ) ;
        global.roads[ 30 ].setroad( 25 , 26 , 1 , 1 ) ;
        global.roads[ 31 ].setroad( 26 , 27 , 1 , 1 ) ;
        global.roads[ 32 ].setroad( 27 , 28 , 1 , 1 ) ;
        global.roads[ 33 ].setroad( 27 , 45 , 1 , 1 ) ;
        global.roads[ 34 ].setroad( 28 , 29 , 1 , 1 ) ;
        global.roads[ 35 ].setroad( 28 , 30 , 1 , 1 ) ;
        global.roads[ 36 ].setroad( 30 , 31 , 1 , 1 ) ;
        global.roads[ 37 ].setroad( 30 , 33 , 1 , 1 ) ;
        global.roads[ 38 ].setroad( 30 , 44 , 1 , 1 ) ;
        global.roads[ 39 ].setroad( 31 , 32 , 1 , 1 ) ;
        global.roads[ 40 ].setroad( 33 , 36 , 1 , 1 ) ;
        global.roads[ 41 ].setroad( 33 , 40 , 1 , 1 ) ;
        global.roads[ 42 ].setroad( 34 , 35 , 1 , 1 ) ;
        global.roads[ 43 ].setroad( 36 , 37 , 1 , 1 ) ;
        global.roads[ 44 ].setroad( 36 , 38 , 1 , 1 ) ;
        global.roads[ 45 ].setroad( 38 , 39 , 1 , 1 ) ;
        global.roads[ 46 ].setroad( 40 , 41 , 1 , 1 ) ;
        global.roads[ 47 ].setroad( 40 , 44 , 1 , 1 ) ;
        global.roads[ 48 ].setroad( 41 , 42 , 1 , 1 ) ;
        global.roads[ 49 ].setroad( 41 , 43 , 1 , 1 ) ;
        global.roads[ 50 ].setroad( 44 , 45 , 1 , 1 ) ;
        global.roads[ 51 ].setroad( 45 , 46 , 1 , 1 ) ;
        global.roads[ 52 ].setroad( 46, 47 , 1 , 1 ) ;
        global.roads[ 53 ].setroad( 46 , 48 , 1 , 1 ) ;
        global.roads[ 54 ].setroad( 47 , 48 , 1 , 1 ) ;
        global.roads[ 55 ].setroad( 48 , 49 , 1 , 1 ) ;
        global.roads[ 56 ].setroad( 48 , 50 , 1 , 1 ) ;
      }
        
     if ( map == 2 ) {//map2 perekrestki
        
    	  global.kolPer = 80 ; 
    	  global.kolDor = 89 ;
    	  
    	  for (int i = 0 ; i < global.kolPer ; i++ ) {
    		  global.koordPer[ i ] = new koord() ;
    	  }
    	  for (int i = 0 ; i < global.kolDor ; i++ ) {
    		  global.roads[ i ] = new road() ;
    	  }
    	
    	global.koordPer[ 0 ].setkoord( 352 , 3 ) ;	//map20 koordinati precrestkov
        global.koordPer[ 1 ].setkoord( 352 , 14 ) ;
        global.koordPer[ 2 ].setkoord( 188 , 31 ) ;
        global.koordPer[ 3 ].setkoord( 14 , 35 ) ;
        global.koordPer[ 4 ].setkoord( 13 , 102 ) ;
        global.koordPer[ 5 ].setkoord( 80 , 99 ) ;
        global.koordPer[ 6 ].setkoord( 85 , 268 ) ;
        global.koordPer[ 7 ].setkoord( 4 , 270 ) ;
        global.koordPer[ 8 ].setkoord( 83 , 316 ) ;
        global.koordPer[ 9 ].setkoord( 5 , 320  ) ;
        global.koordPer[ 10 ].setkoord( 131 , 94 ) ;
        global.koordPer[ 11 ].setkoord( 135 , 279 ) ;
        global.koordPer[ 12 ].setkoord( 268 , 92 ) ;
        global.koordPer[ 13 ].setkoord( 268 , 112 ) ;
        global.koordPer[ 14 ].setkoord( 313 , 134 ) ;
        global.koordPer[ 15 ].setkoord( 330 , 248 ) ;
        global.koordPer[ 16 ].setkoord( 325 , 268 ) ;
        global.koordPer[ 17 ].setkoord( 247 , 129 ) ;
        global.koordPer[ 18 ].setkoord( 241 , 165 ) ;
        global.koordPer[ 19 ].setkoord( 260 , 259 ) ;
        global.koordPer[ 20 ].setkoord( 281 , 271 ) ;
        global.koordPer[ 21 ].setkoord( 389 , 86 ) ;
        global.koordPer[ 22 ].setkoord( 395 , 329 ) ;
        global.koordPer[ 23 ].setkoord( 437 , 328 ) ;
        global.koordPer[ 24 ].setkoord( 355 , 328 ) ;
        global.koordPer[ 25 ].setkoord( 479 , 582 ) ;
        global.koordPer[ 26 ].setkoord( 479 , 656 ) ;
        global.koordPer[ 27 ].setkoord( 479 , 549 ) ;
        global.koordPer[ 28 ].setkoord( 533 , 546 ) ;
        global.koordPer[ 29 ].setkoord( 743 , 544 ) ;
        global.koordPer[ 30 ].setkoord( 472 , 327 ) ;
        global.koordPer[ 31 ].setkoord( 475 , 363 ) ;
        global.koordPer[ 32 ].setkoord( 586 , 359 ) ;
        global.koordPer[ 33 ].setkoord( 623 , 356 ) ;
        global.koordPer[ 34 ].setkoord( 680 , 355 ) ;
        global.koordPer[ 35 ].setkoord( 792 , 354 ) ;
        global.koordPer[ 36 ].setkoord( 469 , 79 ) ;
        global.koordPer[ 37 ].setkoord( 471 , 98 ) ;
        global.koordPer[ 38 ].setkoord( 562 , 99 ) ;
        global.koordPer[ 39 ].setkoord( 563 , 83 ) ;
        global.koordPer[ 40 ].setkoord( 562 , 4 ) ;
        global.koordPer[ 41 ].setkoord( 335 , 54 ) ;
        global.koordPer[ 42 ].setkoord( 782 , 52 ) ;
        global.koordPer[ 43 ].setkoord( 470 , 215 ) ;
        global.koordPer[ 44 ].setkoord( 535 , 214 ) ;
        global.koordPer[ 45 ].setkoord( 532 , 160 ) ;
        global.koordPer[ 46 ].setkoord( 563 , 158 ) ;
        global.koordPer[ 47 ].setkoord( 581 , 158 ) ;
        global.koordPer[ 48 ].setkoord( 617 , 158 ) ;
        global.koordPer[ 49 ].setkoord( 676 , 158 ) ;
        global.koordPer[ 50 ].setkoord( 735 , 159 ) ;
        global.koordPer[ 51 ].setkoord( 739 , 259 ) ;
        global.koordPer[ 52 ].setkoord( 482 , 691 ) ;
        global.koordPer[ 53 ].setkoord( 674 , 473 ) ;
        global.koordPer[ 54 ].setkoord( 672 , 462 ) ;
        global.koordPer[ 55 ].setkoord( 740 , 459 ) ;
        global.koordPer[ 56 ].setkoord( 793 , 456 ) ;
        global.koordPer[ 57 ].setkoord( 197 , 22 ) ;
        global.koordPer[ 58 ].setkoord( 468 , 6 ) ;
        global.koordPer[ 59 ].setkoord( 442 , 689 ) ;
        global.koordPer[ 60 ].setkoord( 384 , 658 ) ;
        global.koordPer[ 61 ].setkoord( 385 , 688 ) ;
        global.koordPer[ 62 ].setkoord( 252 , 663 ) ;
        global.koordPer[ 63 ].setkoord( 359 , 588 ) ;
        global.koordPer[ 64 ].setkoord( 246 , 592 ) ;
        global.koordPer[ 65 ].setkoord( 227 , 602 ) ;
        global.koordPer[ 66 ].setkoord( 5 , 610 ) ;
        global.koordPer[ 67 ].setkoord( 443 , 657 ) ;
        global.koordPer[ 68 ].setkoord( 205 , 691 ) ;
        global.koordPer[ 69 ].setkoord( 110 , 689 ) ;
        global.koordPer[ 70 ].setkoord( 48 , 689 ) ;
        global.koordPer[ 71 ].setkoord( 203 , 608 ) ;
        global.koordPer[ 72 ].setkoord( 50 , 672 ) ;
        global.koordPer[ 73 ].setkoord( 205 , 671 ) ;
        global.koordPer[ 74 ].setkoord( 109 , 670 ) ;
        global.koordPer[ 75 ].setkoord( 477 , 478 ) ;
        global.koordPer[ 76 ].setkoord( 532 , 587 ) ;
        global.koordPer[ 77 ].setkoord( 447 , 583 ) ;
        global.koordPer[ 78 ].setkoord( 672 , 437 ) ;
        global.koordPer[ 79 ].setkoord( 548 , 688 ) ;

	
        global.roads[ 0 ].setroad(0 , 1 , 1 , 1 ) ; //map2roads
        global.roads[ 1 ].setroad( 1 , 57 , 1 , 1 ) ;
        global.roads[ 2 ].setroad( 57 , 2 , 1 , 1 ) ;
        global.roads[ 3 ].setroad( 2 , 3 , 1 , 1 ) ;
        global.roads[ 4 ].setroad( 3 , 4 , 1 , 1 ) ;
        global.roads[ 5 ].setroad( 4 , 5 , 1 , 1 ) ;
        global.roads[ 6 ].setroad( 5 , 6 , 1 , 1 ) ;
        global.roads[ 7 ].setroad( 5 , 10 , 1 , 1 ) ;
        global.roads[ 8 ].setroad( 6 , 7 , 1 , 1 ) ;
        global.roads[ 9 ].setroad( 6 , 8 , 1 , 1 ) ;
        global.roads[ 10 ].setroad( 8 , 9 , 1 , 1 ) ;
        global.roads[ 11 ].setroad( 8 , 11 , 1 , 1 ) ;
        global.roads[ 12 ].setroad( 10 , 11 , 1 , 1 ) ;
        global.roads[ 13 ].setroad( 10 , 12 , 1 , 1 ) ;
        global.roads[ 14 ].setroad( 12 , 13 , 1 , 1 ) ;
        global.roads[ 15 ].setroad( 12 , 21 , 1 , 1 ) ;
        global.roads[ 16 ].setroad( 13 , 14 , 1 , 1 ) ;
        global.roads[ 17 ].setroad( 13 , 17 , 1 , 1 ) ;
        global.roads[ 18 ].setroad( 14 , 15 , 1 , 1 ) ;
        global.roads[ 19 ].setroad( 15 , 16 , 1 , 1 ) ;
        global.roads[ 20 ].setroad( 16 , 20 , 1 , 1 ) ;
        global.roads[ 21 ].setroad( 16 , 24 , 1 , 1 ) ;
        global.roads[ 22 ].setroad( 17 , 18 , 1 , 1 ) ;
        global.roads[ 23 ].setroad( 18 , 19 , 1 , 1 ) ;
        global.roads[ 24 ].setroad( 19 , 20 , 1 , 1 ) ;
        global.roads[ 25 ].setroad( 21 , 22 , 1 , 1 ) ;
        global.roads[ 26 ].setroad( 21 , 36 , 1 , 1 ) ;
        global.roads[ 27 ].setroad( 22 , 23 , 1 , 1 ) ;
        global.roads[ 28 ].setroad( 22 , 24 , 1 , 1 ) ;
        global.roads[ 29 ].setroad( 23 , 30 , 1 , 1 ) ;
        global.roads[ 30 ].setroad( 23 , 77 , 1 , 1 ) ;
        global.roads[ 31 ].setroad( 24 , 63 , 1 , 1 ) ;
        global.roads[ 32 ].setroad( 25 , 26 , 1 , 1 ) ;
        global.roads[ 33 ].setroad( 25 , 27 , 1 , 1 ) ;
        global.roads[ 34 ].setroad( 25 , 77 , 1 , 1 ) ;
        global.roads[ 35 ].setroad( 26 , 52 , 1 , 1 ) ;
        global.roads[ 36 ].setroad( 26 , 67 , 1 , 1 ) ;
        global.roads[ 37 ].setroad( 27 , 28 , 1 , 1 ) ;
        global.roads[ 38 ].setroad( 27 , 75 , 1 , 1 ) ;
        global.roads[ 39 ].setroad( 28 , 29 , 1 , 1 ) ;
        global.roads[ 40 ].setroad( 28 , 76 , 1 , 1 ) ;
        global.roads[ 41 ].setroad( 29 , 55 , 1 , 1 ) ;
        global.roads[ 42 ].setroad( 30 , 31 , 1 , 1 ) ;
        global.roads[ 43 ].setroad( 30 , 43 , 1 , 1 ) ;
        global.roads[ 44 ].setroad( 31 , 32 , 1 , 1 ) ;
        global.roads[ 45 ].setroad( 31 , 75 , 1 , 1 ) ;
        global.roads[ 46 ].setroad( 32 , 33 , 1 , 1 ) ;
        global.roads[ 47 ].setroad( 32 , 47 , 1 , 1 ) ;
        global.roads[ 48 ].setroad( 33 , 34 , 1 , 1 ) ;
        global.roads[ 48 ].setroad( 33 , 48 , 1 , 1 ) ;
        global.roads[ 49 ].setroad( 34 , 35 , 1 , 1 ) ;
        global.roads[ 50 ].setroad( 34 , 49 , 1 , 1 ) ;
        global.roads[ 51 ].setroad( 36 , 37 , 1 , 1 ) ;
        global.roads[ 52 ].setroad( 36 , 58 , 1 , 1 ) ;
        global.roads[ 53 ].setroad( 37 , 38 , 1 , 1 ) ;
        global.roads[ 54 ].setroad( 37 , 43 , 1 , 1 ) ;
        global.roads[ 55 ].setroad( 38 , 39 , 1 , 1 ) ;
        global.roads[ 56 ].setroad( 38 , 46 , 1 , 1 ) ;
        global.roads[ 57 ].setroad( 39 , 40 , 1 , 1 ) ;
        global.roads[ 58 ].setroad( 39 , 41 , 1 , 1 ) ;
        global.roads[ 59 ].setroad( 41 , 42 , 1 , 1 ) ;
        global.roads[ 60 ].setroad( 43 , 44 , 1 , 1 ) ;
        global.roads[ 61 ].setroad( 44 , 45 , 1 , 1 ) ;
        global.roads[ 62 ].setroad( 45 , 46 , 1 , 1 ) ;
        global.roads[ 63 ].setroad( 46 , 47 , 1 , 1 ) ;
        global.roads[ 64 ].setroad( 47 , 48 , 1 , 1 ) ;
        global.roads[ 65 ].setroad( 48 , 49 , 1 , 1 ) ;
        global.roads[ 66 ].setroad( 49 , 50 , 1 , 1 ) ;
        global.roads[ 67 ].setroad( 50 , 51 , 1 , 1 ) ;
        global.roads[ 68 ].setroad( 53 , 54 , 1 , 1 ) ;
        global.roads[ 69 ].setroad( 53 , 75 , 1 , 1 ) ;
        global.roads[ 70 ].setroad( 54 , 55 , 1 , 1 ) ;
        global.roads[ 71 ].setroad( 54 , 78 , 1 , 1 ) ;
        global.roads[ 72 ].setroad( 55 , 56 , 1 , 1 ) ;
        global.roads[ 73 ].setroad( 59 , 67 , 1 , 1 ) ;
        global.roads[ 74 ].setroad( 60 , 61 , 1 , 1 ) ;
        global.roads[ 75 ].setroad( 60 , 62 , 1 , 1 ) ;
        global.roads[ 76 ].setroad( 62 , 65 , 1 , 1 ) ;
        global.roads[ 77 ].setroad( 62 , 73 , 1 , 1 ) ;
        global.roads[ 78 ].setroad( 63 , 64 , 1 , 1 ) ;
        global.roads[ 79 ].setroad( 63 , 77 , 1 , 1 ) ;
        global.roads[ 80 ].setroad( 64 , 65 , 1 , 1 ) ;
        global.roads[ 81 ].setroad( 65 , 71 , 1 , 1 ) ;
        global.roads[ 82 ].setroad( 66 , 71 , 1 , 1 ) ;
        global.roads[ 83 ].setroad( 68 , 73 , 1 , 1 ) ;
        global.roads[ 84 ].setroad( 69 , 74 , 1 , 1 ) ;
        global.roads[ 85 ].setroad( 70 , 72 , 1 , 1 ) ;
        global.roads[ 86 ].setroad( 72 , 74 , 1 , 1 ) ;
        global.roads[ 87 ].setroad( 73 , 74 , 1 , 1 ) ;
        global.roads[ 88 ].setroad( 76 , 79 , 1 , 1 ) ;
      }
     
		if ( map == 3 ) {
			
			global.kolPer = 94 ; 
	    	  global.kolDor = 99 ;
	    	  
	    	  for (int i = 0 ; i < global.kolPer ; i++ ) {
	    		  global.koordPer[ i ] = new koord() ;
	    	  }
	    	  for (int i = 0 ; i < global.kolDor ; i++ ) {
	    		  global.roads[ i ] = new road() ;
	    	  }
	    	global.koordPer[ 0 ].setkoord( 8 , 101 ) ;	//map3 koordinati precrestkov
	        global.koordPer[ 1 ].setkoord( 33 , 4 ) ;
	        global.koordPer[ 2 ].setkoord( 36 , 48 ) ;
	        global.koordPer[ 3 ].setkoord( 8 , 47 ) ;
	        global.koordPer[ 4 ].setkoord( 40 , 98 ) ;
	        global.koordPer[ 5 ].setkoord( 51 , 247 ) ;
	        global.koordPer[ 6 ].setkoord( 6 , 249 ) ;
	        global.koordPer[ 7 ].setkoord( 54 , 292 ) ;
	        global.koordPer[ 8 ].setkoord( 8 , 292 ) ;
	        global.koordPer[ 9 ].setkoord( 55 , 306 ) ;
	        global.koordPer[ 10 ].setkoord( 234 , 294 ) ;
	        global.koordPer[ 11 ].setkoord( 426 , 282 ) ;
	        global.koordPer[ 12 ].setkoord( 423 , 215 ) ;
	        global.koordPer[ 13 ].setkoord( 481 , 213 ) ;
	        global.koordPer[ 14 ].setkoord( 478 , 156 ) ;
	        global.koordPer[ 15 ].setkoord( 513 , 219 ) ;
	        global.koordPer[ 16 ].setkoord( 556 , 216 ) ;
	        global.koordPer[ 17 ].setkoord( 416 , 73 ) ;
	        global.koordPer[ 18 ].setkoord( 447 , 94 ) ;
	        global.koordPer[ 19 ].setkoord( 445 , 73 ) ;
	        global.koordPer[ 20 ].setkoord( 446 , 42 ) ;
	        global.koordPer[ 21 ].setkoord( 413 , 15 ) ;
	        global.koordPer[ 22 ].setkoord( 311 , 18 ) ;
	        global.koordPer[ 23 ].setkoord( 272 , 9 ) ;
	        global.koordPer[ 24 ].setkoord( 316 , 125 ) ;
	        global.koordPer[ 25 ].setkoord( 517 , 263 ) ;
	        global.koordPer[ 26 ].setkoord( 535 , 261 ) ;
	        global.koordPer[ 27 ].setkoord( 661 , 251 ) ;
	        global.koordPer[ 28 ].setkoord( 613 , 26 ) ;
	        global.koordPer[ 29 ].setkoord( 756 , 246 ) ;
	        global.koordPer[ 30 ].setkoord( 744 , 6 ) ;
	        global.koordPer[ 31 ].setkoord( 59 , 379 ) ;
	        global.koordPer[ 32 ].setkoord( 8 , 382 ) ;
	        global.koordPer[ 33 ].setkoord( 59 , 396 ) ;
	        global.koordPer[ 34 ].setkoord( 110 , 394 ) ;
	        global.koordPer[ 35 ].setkoord( 111 , 379 ) ;
	        global.koordPer[ 36 ].setkoord( 110 , 363 ) ;
	        global.koordPer[ 37 ].setkoord( 148 , 378 ) ;
	        global.koordPer[ 38 ].setkoord( 234 , 359 ) ;
	        global.koordPer[ 39 ].setkoord( 388 , 353 ) ;
	        global.koordPer[ 40 ].setkoord( 399 , 390 ) ;
	        global.koordPer[ 41 ].setkoord( 433 , 390 ) ;
	        global.koordPer[ 42 ].setkoord( 433 , 373 ) ;
	        global.koordPer[ 43 ].setkoord( 497 , 369 ) ;
	        global.koordPer[ 44 ].setkoord( 492 , 313 ) ;
	        global.koordPer[ 45 ].setkoord( 537 , 311 ) ;
	        global.koordPer[ 46 ].setkoord( 538 , 328 ) ;
	        global.koordPer[ 47 ].setkoord( 599 , 325 ) ;
	        global.koordPer[ 48 ].setkoord( 603 , 442 ) ;
	        global.koordPer[ 49 ].setkoord( 704 , 435 ) ;
	        global.koordPer[ 50 ].setkoord( 702 , 359 ) ;
	        global.koordPer[ 51 ].setkoord( 698 , 309 ) ;
	        global.koordPer[ 52 ].setkoord( 665 , 309 ) ;
	        global.koordPer[ 53 ].setkoord( 759 , 356 ) ;
	        global.koordPer[ 54 ].setkoord( 765 , 509 ) ;
	        global.koordPer[ 55 ].setkoord( 771 , 648 ) ;
	        global.koordPer[ 56 ].setkoord( 642 , 25 ) ;
	        global.koordPer[ 57 ].setkoord( 391 , 389 ) ;
	        global.koordPer[ 58 ].setkoord( 606 , 544 ) ;
	        global.koordPer[ 59 ].setkoord( 670 , 543 ) ;
	        global.koordPer[ 60 ].setkoord( 654 , 41 ) ;
	        global.koordPer[ 61 ].setkoord( 403 , 435 ) ;
	        global.koordPer[ 62 ].setkoord( 435 , 435 ) ;
	        global.koordPer[ 63 ].setkoord( 438 , 467 ) ;
	        global.koordPer[ 64 ].setkoord( 437 , 484 ) ;
	        global.koordPer[ 65 ].setkoord( 505 , 480 ) ;
	        global.koordPer[ 66 ].setkoord( 517 , 481 ) ;
	        global.koordPer[ 67 ].setkoord( 403 , 467 ) ;
	        global.koordPer[ 68 ].setkoord( 117 , 494 ) ;
	        global.koordPer[ 69 ].setkoord( 62 , 494 ) ;
	        global.koordPer[ 70 ].setkoord( 113 , 419 ) ;
	        global.koordPer[ 71 ].setkoord( 149 , 418 ) ;
	        global.koordPer[ 72 ].setkoord( 151 , 409 ) ;
	        global.koordPer[ 73 ].setkoord( 234 , 408 ) ;
	        global.koordPer[ 74 ].setkoord( 234 , 549 ) ;
	        global.koordPer[ 75 ].setkoord( 383 , 532 ) ;
	        global.koordPer[ 76 ].setkoord( 383 , 471 ) ;
	        global.koordPer[ 77 ].setkoord( 236 , 574 ) ;
	        global.koordPer[ 78 ].setkoord( 294 , 576 ) ;
	        global.koordPer[ 79 ].setkoord( 300 , 649 ) ;
	        global.koordPer[ 80 ].setkoord( 237 , 648 ) ;
	        global.koordPer[ 81 ].setkoord( 68 , 646 ) ;
	        global.koordPer[ 82 ].setkoord( 376 , 648 ) ;
	        global.koordPer[ 83 ].setkoord( 379 , 625 ) ;
	        global.koordPer[ 84 ].setkoord( 62 , 4800) ;
	        global.koordPer[ 85 ].setkoord( 7 , 487 ) ;
	        global.koordPer[ 86 ].setkoord( 708 , 508 ) ;
	        global.koordPer[ 87 ].setkoord( 125 , 550 ) ;
	        global.koordPer[ 88 ].setkoord( 236 , 540 ) ;
	        global.koordPer[ 89 ].setkoord( 448 , 649 ) ;
	        global.koordPer[ 90 ].setkoord( 426 , 268 ) ;
	        global.koordPer[ 91 ].setkoord( 309 , 8 ) ;
	        global.koordPer[ 92 ].setkoord( 527 , 636 ) ;
	        global.koordPer[ 93 ].setkoord( 445 , 620 ) ;
		
	        global.roads[ 0 ].setroad(0 , 4 , 1 , 1 ) ; //map3roads
	        global.roads[ 1 ].setroad( 1 , 2 , 1 , 1 ) ;
	        global.roads[ 2 ].setroad( 2 , 3 , 1 , 1 ) ;
	        global.roads[ 3 ].setroad( 2 , 4 , 1 , 1 ) ;
	        global.roads[ 4 ].setroad( 4 , 5 , 1 , 1 ) ;
	        global.roads[ 5 ].setroad( 5 , 6 , 1 , 1 ) ;
	        global.roads[ 6 ].setroad( 5 , 7 , 1 , 1 ) ;
	        global.roads[ 7 ].setroad( 7 , 8 , 1 , 1 ) ;
	        global.roads[ 8 ].setroad( 7 , 9 , 1 , 1 ) ;
	        global.roads[ 9 ].setroad( 9 , 10 , 1 , 1 ) ;
	        global.roads[ 10 ].setroad( 9 , 31 , 1 , 1 ) ;
	        global.roads[ 11 ].setroad( 10 , 11 , 1 , 1 ) ;
	        global.roads[ 12 ].setroad( 10 , 38 , 1 , 1 ) ;
	        global.roads[ 13 ].setroad( 11 , 42 , 2 , 0 ) ;
	        global.roads[ 14 ].setroad( 11 , 90 , 0 , 2 ) ;
	        global.roads[ 15 ].setroad( 12 , 13 , 1 , 1 ) ;
	        global.roads[ 16 ].setroad( 12 , 17 , 0 , 2 ) ;
	        global.roads[ 17 ].setroad( 12 , 90 , 2 , 0 ) ;
	        global.roads[ 18 ].setroad( 13 , 14 , 1 , 1 ) ;
	        global.roads[ 19 ].setroad( 13 , 15 , 1 , 1 ) ;
	        global.roads[ 20 ].setroad( 15 , 16 , 1 , 1 ) ;
	        global.roads[ 21 ].setroad( 15 , 25 , 1 , 1 ) ;
	        global.roads[ 22 ].setroad( 17 , 19 , 1 , 1 ) ;
	        global.roads[ 23 ].setroad( 17 , 21 , 0 , 2 ) ;
	        global.roads[ 24 ].setroad( 18 , 19 , 1 , 1 ) ;
	        global.roads[ 25 ].setroad( 19 , 20 , 1 , 1 ) ;
	        global.roads[ 26 ].setroad( 21 , 22 , 1 , 1 ) ;
	        global.roads[ 27 ].setroad( 22 , 24 , 1 , 1 ) ;
	        global.roads[ 28 ].setroad( 22 , 91 , 1 , 1 ) ;
	        global.roads[ 29 ].setroad( 23 , 91 , 1 , 1 ) ;
	        global.roads[ 30 ].setroad( 25 , 26 , 1 , 1 ) ;
	        global.roads[ 31 ].setroad( 25 , 90 , 1 , 1 ) ;
	        global.roads[ 32 ].setroad( 26 , 27 , 1 , 1 ) ;
	        global.roads[ 33 ].setroad( 26 , 45 , 1 , 1 ) ;
	        global.roads[ 34 ].setroad( 27 , 29 , 1 , 1 ) ;
	        global.roads[ 35 ].setroad( 27 , 52 , 1 , 1 ) ;
	        global.roads[ 36 ].setroad( 27 , 60 , 1 , 1 ) ;
	        global.roads[ 37 ].setroad( 28 , 56 , 1 , 1 ) ;
	        global.roads[ 38 ].setroad( 29 , 30 , 2 , 1 ) ;
	        global.roads[ 39 ].setroad( 29 , 53 , 1 , 2 ) ;
	        global.roads[ 40 ].setroad( 38 , 39 , 1 , 1 ) ;
	        global.roads[ 41 ].setroad( 38 , 73 , 1 , 1 ) ;
	        global.roads[ 42 ].setroad( 39 , 57 , 1 , 1 ) ;
	        global.roads[ 43 ].setroad( 40 , 41 , 1 , 1 ) ;
	        global.roads[ 44 ].setroad( 40 , 57 , 1 , 1 ) ;
	        global.roads[ 45 ].setroad( 40 , 61 , 1 , 1 ) ;
	        global.roads[ 46 ].setroad( 41 , 42 , 0 , 2 ) ;
	        global.roads[ 47 ].setroad( 41 , 62 , 2 , 0 ) ;
	        global.roads[ 48 ].setroad( 42 , 43 , 1 , 1 ) ;
	        global.roads[ 48 ].setroad( 43 , 44 , 1 , 1 ) ;
	        global.roads[ 49 ].setroad( 43 , 65 , 1 , 1 ) ;
	        global.roads[ 50 ].setroad( 44 , 45 , 1 , 1 ) ;
	        global.roads[ 51 ].setroad( 45 , 46 , 1 , 1 ) ;
	        global.roads[ 53 ].setroad( 46 , 47 , 1 , 1 ) ;
	        global.roads[ 52 ].setroad( 47 , 48 , 1 , 1 ) ;
	        global.roads[ 53 ].setroad( 48 , 49 , 1 , 1 ) ;
	        global.roads[ 56 ].setroad( 48 , 58 , 1 , 1 ) ;
	        global.roads[ 54 ].setroad( 49 , 50 , 1 , 1 ) ;
	        global.roads[ 55 ].setroad( 49 , 86 , 1 , 1 ) ;
	        global.roads[ 56 ].setroad( 50 , 51 , 1 , 1 ) ;
	        global.roads[ 60 ].setroad( 50 , 53 , 1 , 1 ) ;
	        global.roads[ 61 ].setroad( 51 , 52 , 1 , 1 ) ;
	        global.roads[ 62 ].setroad( 53 , 54 , 1 , 2 ) ;
	        global.roads[ 63 ].setroad( 54 , 55 , 1 , 2 ) ;
	        global.roads[ 64 ].setroad( 54 , 86 , 1 , 1 ) ;
	        global.roads[ 65 ].setroad( 56 , 60 , 1 , 1 ) ;
	        global.roads[ 66 ].setroad( 58 , 59 , 1 , 1 ) ;
	        global.roads[ 67 ].setroad( 58 , 60 , 1 , 1 ) ;
	        global.roads[ 68 ].setroad( 61 , 62 , 1 , 1 ) ;
	        global.roads[ 69 ].setroad( 61 , 67 , 1 , 1 ) ;
	        global.roads[ 70 ].setroad( 62 , 63 , 2 , 0 ) ;
	        global.roads[ 71 ].setroad( 63 , 64 , 2 , 0 ) ;
	        global.roads[ 72 ].setroad( 63 , 67 , 1 , 1 ) ;
	        global.roads[ 73 ].setroad( 64 , 65 , 1 , 1 ) ;
	        global.roads[ 74 ].setroad( 64 , 93 , 2 , 0 ) ;
	        global.roads[ 75 ].setroad( 65 , 66 , 1 , 1 ) ;
	        global.roads[ 76 ].setroad( 66 , 92 , 1 , 1 ) ;
	        global.roads[ 77 ].setroad( 67 , 76 , 1 , 1 ) ;
	        global.roads[ 78 ].setroad( 68 , 69 , 1 , 1 ) ;
	        global.roads[ 79 ].setroad( 68 , 70 , 1 , 1 ) ;
	        global.roads[ 80 ].setroad( 68 , 87 , 1 , 1 ) ;
	        global.roads[ 81 ].setroad( 69 , 81 , 1 , 1 ) ;
	        global.roads[ 82 ].setroad( 69 , 84 , 1 , 1 ) ;
	        global.roads[ 83 ].setroad( 70 , 71 , 1 , 1 ) ;
	        global.roads[ 84 ].setroad( 71 , 72 , 1 , 1 ) ;
	        global.roads[ 85 ].setroad( 72 , 73 , 1 , 1 ) ;
	        global.roads[ 86 ].setroad( 73 , 88 , 1 , 1 ) ;
	        global.roads[ 87 ].setroad( 74 , 77 , 1 , 1 ) ;
	        global.roads[ 88 ].setroad( 74 , 87 , 1 , 1 ) ;
	        global.roads[ 89 ].setroad( 74 , 88 , 1 , 1 ) ;
	        global.roads[ 90 ].setroad( 75 , 76 , 1 , 1 ) ;
	        global.roads[ 91 ].setroad( 75 , 88 , 1 , 1 ) ;
	        global.roads[ 92 ].setroad( 77 , 78 , 1 , 1 ) ;
	        global.roads[ 93 ].setroad( 77 , 80 , 1 , 1 ) ;
	        global.roads[ 94 ].setroad( 78 , 79 , 1 , 1 ) ;
	        global.roads[ 95 ].setroad( 82 , 83 , 1 , 1 ) ;
	        global.roads[ 96 ].setroad( 83 , 93 , 1 , 1 ) ;
	        global.roads[ 97 ].setroad( 84 , 85 , 1 , 1 ) ;
	        global.roads[ 98 ].setroad( 89 , 93 , 0 , 2 ) ;
	      	}
		
	    for ( int i = 0 ; i < global.kolPer ; i++ ) //fill array cost "0"
	    	for ( int j = 0 ; j < global.kolPer ; j++ ) {
	    		global.cost[ i ][ j ] = 0 ;
	    	}
	    for ( int i = 0 ; i < global.kolDor ; i++){
	    	if ( global.roads[ 0 ].roadsto != 0 ) global.cost[ global.roads[ i ].startpoint ][ global.roads[ i ].endpoint ] = global.roads[ i ].length ;
	    	if ( global.roads[ 0 ].roadsback != 0 ) global.cost[ global.roads[ i ].endpoint ][ global.roads[ i ].startpoint ] = global.roads[ i ].length ;
	    }
	}

}
