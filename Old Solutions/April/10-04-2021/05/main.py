###could you check this code and fix it acourding to the picture and add comment
#function used
def calculate(camels):
    
    try:
        camels = int(camels)
    except ValueError as e:
        print(e)
        return

    #if number was negative
    if camels<0:
        print('Wrong Input. Number should be an integer greater than 0')
    
    #if camels are from 1-4
    elif camels<5:
        print('For ', camels , ' camels, there is no Zakat')

    #5-24
    elif camels<25:
        print('For ', camels , ' camels, Zakat consists of ', int(camels/5), ' sheep')

    #25-35 similarly others
    elif camels<36:
        print('For ', camels , ' camels, Zakat consists of 1 bint Makhadh')

    elif camels<46:
        print('For ', camels , ' camels, Zakat consists of 1 bint Laboun')

    elif camels<61:
        print('For ', camels , ' camels, Zakat consists of 1 Hiqqah')

    elif camels<76:
        print('For ', camels , ' camels, Zakat consists of 1 Jathaah')

    elif camels<91:
        print('For ', camels , ' camels, Zakat consists of 2 bint Laboun')

    elif camels<121:
        print('For ', camels , ' camels, Zakat consists of 2 Hiqqah')

    #for 121 and more
    else:
        #b is for bint Laboun and h for Hiqqah
        b =0
        h = 0

        #take remainder max equal to camels itself for now
        remainder = camels

        #run loops over maximum multiples that can be
        #which can be max for bint laboun

        #we will check for each mutiple of bint laboun which has least remainder
        
        for i in range(int(camels/40) +1):
            temp = camels
            
            #multiples of bin laboun are i, so subtract 40*i camels from temp
            temp = temp- i*40

            #now calculate multiples of hiqqah that can be
            j = int(temp/50)

            #now find remainder
            rem = temp % 50

            #if this remainder is less that previous value then take
            #these values of b and h
            if rem< remainder:
                remainder = rem
                b = i
                h = j


        print('For ', camels , ' camels, Zakat consists of ', b, ' bint Laboun and ', h, ' Hiqqah')

#################################################################


# main function
def main():
	# take input
	camels = input('\nEnter number of camels: ')
	
	## find zakat
	calculate(camels)

if __name__ == "__main__":
	main()