CFLAGS = -O 
CC = g++ 
Main: Main.o Car.o
	$(CC) $(CFLAGS) -o Main Main.o Car.o
Main.o: Main.cpp 
	$(CC) $(CFLAGS) -c Main.cpp 
Car.o: Car.cpp 
	$(CC) $(CFLAGS) -c Car.cpp 
clean: 
	-del *exe *o