����   8 ^  unit9/TotalArea  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lunit9/TotalArea; main ([Ljava/lang/String;)V
     createCircleArray &()[Lunit9/CircleWithPrivateDataFields;
     printCircleArray '([Lunit9/CircleWithPrivateDataFields;)V args [Ljava/lang/String; circleArray $[Lunit9/CircleWithPrivateDataFields;  !unit9/CircleWithPrivateDataFields
  !   java/lang/Math " # random ()D@Y      
  '  ( (D)V i I StackMapTable 	 . 0 / java/lang/System 1 2 out Ljava/io/PrintStream; 4 %-30s%-15s
 6 Radius 8 Area
 : < ; java/io/PrintStream = > printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; @ %-30f%-15f

  B C # 	getRadius
 E G F java/lang/Double H I valueOf (D)Ljava/lang/Double;
  K L # getArea N ----------------------------------------------
 : P Q R println (Ljava/lang/String;)V T %-30s%-15f
 V The total area of circles is
  X Y Z sum '([Lunit9/CircleWithPrivateDataFields;)D D 
SourceFile TotalArea.java !               /     *� �    
                    	       E     	� L+� �    
         
          	          	       z     &� K<� *� Y�  $k� &S�*����*�    
          
    $        !       ) *  +   
 � 
 , 	       �     o� -3� Y5SY7S� 9W<� +� -?� Y*2� A� DSY*2� J� DS� 9W�*���ղ -M� O� -S� YUSY*� W� DS� 9W�    
            A  J  R  n         o      1 ) *  +    � ' 	 Y Z     w     H>� '*2� JcH�*����'�    
       !  #  $  #  '                Y [    ) *  +    �   \    ]