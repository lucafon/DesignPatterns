'''
Created on Nov 13, 2016

@author: Admin
'''

from ClockTimer import *
import time

def main():
    clock_timer = ClockTimer()
    clock_timer.add_observer(ClockObserver12())
    clock_timer.add_observer(ClockObserver24())
    
    for i in range(0,5):
        clock_timer.tick()
        time.sleep(1)
        
if __name__ == '__main__':
    main()