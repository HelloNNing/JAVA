����   8 R  unit9/TestTV  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lunit9/TestTV; main ([Ljava/lang/String;)V  unit9/TV
  	
     turnOn
     
setChannel (I)V
     	setVolume
     	channelUp
  ! "  volumeUp	 $ & % java/lang/System ' ( out Ljava/io/PrintStream; * java/lang/StringBuilder , tv1's channel is 
 ) .  / (Ljava/lang/String;)V	  1 2 3 channel I
 ) 5 6 7 append (I)Ljava/lang/StringBuilder; 9  and volume level is 
 ) ; 6 < -(Ljava/lang/String;)Ljava/lang/StringBuilder;	  > ? 3 volumeLevel
 ) A B C toString ()Ljava/lang/String;
 E G F java/io/PrintStream H / println J tv2's channel is  args [Ljava/lang/String; tv1 
Lunit9/TV; tv2 
SourceFile TestTV.java !               /     *� �    
                    	       �     z� Y� L+� +� +� � Y� M,� ,� ,� ,�  � #� )Y+� -+� 0� 48� :+� =� 4� @� D� #� )YI� -,� 0� 48� :,� =� 4� @� D�    
   2          	     #  '  +  /  T  y          z K L    r M N   [ O N   P    Q