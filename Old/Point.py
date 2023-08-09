import math

class Point:
    # Constructor
    def __init__(self, x, y):
        self.x = x
        self.y = y

    # Returns Distance Of A Point From Origin
    def distance(self):
        return math.sqrt(self.x ** 2 + self.y ** 2)

    # P1 == P2 If They Are Equidistant From Origin
    def __eq__(self, p):
        return self.distance() == p.distance()

    # P1 > P2 If Distance From Origin Is More
    def __gt__(self, p):
        return self.distance() > p.distance()
    
    # P1 < P2 If Distance From Origin Is Less
    def __lt__(self, p):
        return self.distance() < p.distance()

    def __str__(self):
        return f'Point({self.x}, {self.y})'
        

if __name__ == '__main__':
    p1 = Point(3, 4)
    p2 = Point(-5, 0)
    p3 = Point(0, 5)
    p4 = Point(0, 0)
    p5 = Point(6, 3)

    # Test Constructor
    assert p1.x == 3
    assert p1.y == 4

    # Test Distance Helper
    assert p1.distance() == 5

    # Test Equals
    assert p1 == p2
    assert not p4 == p3

    # Test <
    assert p4 < p1
    assert not p5 < p4

    # Test >
    assert p5 > p1
    assert not p4 > p2
    
    # Test Str
    assert str(p4) == 'Point(0, 0)'
    assert not str(p1) == 'Point(3, 5)'
    print(p4)
    print(p3)