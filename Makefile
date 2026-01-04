JC=javac
SRC=src
BUILD=build/class
LIB=-cp "./lib/gson-2.13.1.jar"
LIB_C=-cp "./lib/gson-2.13.1.jar;src"


Main.class : $(SRC)Main.java $(SRC)Character.class $(SRC)Weapon.class $(SRC)FiltreCharacter.class $(SRC)FiltreWeapon.class $(SRC)GenshinData.class
	$(JC) $(LIB) -d $(BUILD) $(SRC)MainVisualiseur.java

Character.class : $(SRC)Character.java
	$(JC) $(LIB) -d $(BUILD) $(SRC)Character.java

Weapon.class : $(SRC)Weapon.java
	$(JC) $(LIB) -d $(BUILD) $(SRC)Weapon.java

FiltreCharacter.class : $(SRC)FiltreCharacter.java
	$(JC) $(LIB) -d $(BUILD) $(SRC)FiltreCharacter.java

FiltreWeapon.class : $(SRC)FiltreWeapon.java
	$(JC) $(LIB) -d $(BUILD) $(SRC)FiltreWeapon.java

GenshinData.class : $(SRC)GenshinData.java
	$(JC) $(LIB) -d $(BUILD) $(SRC)GenshinData.java


run :
	$(JC) $(LIB_C) Main

clean:
	rm -rf $(BUILD)
