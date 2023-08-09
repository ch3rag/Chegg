CFLAGS = -O 
CC = g++ 
Main: Main.o Dealership.o Vehicle.o
	$(CC) $(CFLAGS) -o Main Main.o Dealership.o Vehicle.o
Main.o: Main.cpp 
	$(CC) $(CFLAGS) -c Main.cpp 
Dealership.o: Dealership.cpp 
	$(CC) $(CFLAGS) -c Dealership.cpp 
Vehicle.o: Vehicle.cpp 
	$(CC) $(CFLAGS) -c Vehicle.cpp 
clean: 
	-del *exe *o