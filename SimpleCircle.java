����   8 O  unit9/SimpleCircle  java/lang/Object radius D main ([Ljava/lang/String;)V Code
     <init> ()V	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  !The area of the circle of radius 
     (Ljava/lang/String;)V	    
      append (D)Ljava/lang/StringBuilder; "  is 
  $  % -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  ' ( ) getArea ()D
  + , - toString ()Ljava/lang/String;
 / 1 0 java/io/PrintStream 2  println@9      
  6  7 (D)V@_@     @Y       LineNumberTable LocalVariableTable args [Ljava/lang/String; circle1 Lunit9/SimpleCircle; circle2 circle3
   this 	newRadius@	!�TD- getPerimeter@        	setRadius 
SourceFile SimpleCircle.java !             	    	  "     �� Y� 
L� � Y� +� � !� #+� &� � *� .� Y 3� 5M� � Y� ,� � !� #,� &� � *� .� Y 8� 5N� � Y� -� � !� #-� &� � *� ., :� � � Y� ,� � !� #,� &� � *� .�    <   & 	      - 	 8 
 ]  h  �  �  �  =   *    � > ?    � @ A  8 � B A  h R C A       	   <     
*� D*� �    <          	  =       
 E A      7  	   F     
*� D*'� �    <          	  =       
 E A     
 F     ( )  	   8     *� *� k Gk�    <       " =        E A     I )  	   7      J*� k Gk�    <       ' =        E A     L 7  	   >     *'� �    <   
    ,  - =        E A      F    M    N