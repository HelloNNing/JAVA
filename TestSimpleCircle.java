����   8 K  unit9/TestSimpleCircle  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lunit9/TestSimpleCircle; main ([Ljava/lang/String;)V  unit9/SimpleCircle
  		    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  !The area of the circle of radius 
     (Ljava/lang/String;)V	  ! " # radius D
  % & ' append (D)Ljava/lang/StringBuilder; )  is 
  + & , -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  . / 0 getArea ()D
  2 3 4 toString ()Ljava/lang/String;
 6 8 7 java/io/PrintStream 9  println@9      
  =  > (D)V@_@     @Y       args [Ljava/lang/String; circle1 Lunit9/SimpleCircle; circle2 circle3 
SourceFile TestSimpleCircle.java !               /     *� �    
                    	      "     �� Y� L� � Y� +�  � $(� *+� -� $� 1� 5� Y :� <M� � Y� ,�  � $(� *,� -� $� 1� 5� Y ?� <N� � Y� -�  � $(� *-� -� $� 1� 5, A�  � � Y� ,�  � $(� *,� -� $� 1� 5�    
   & 	      - 	 8 
 ]  h  �  �  �     *    � C D    � E F  8 � G F  h R H F   I    J