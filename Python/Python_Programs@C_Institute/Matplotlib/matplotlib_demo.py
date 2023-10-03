import matplotlib.pyplot as plt

import numpy as np

x = np.linspace(0, 5, 11) # (start, stop, num (no. of values))

# numpy.linspace() returns am evenly spaced numpy array containing the specified number of random values w.r.t. the interval provided. It is similar to numpy.arange() function but instead of step, it uses sample number. 

y = x ** 2

# returns a numpy array containing squared values of numpy array x

plt.plot(x, y, 'r-*')

# generates a plot / figure, 'r' is the red color, and '-*' is the style

plt.xlabel('X Axis Title Here')

# xlabel sets the x-axis label

plt.ylabel('Y Axis Title Here')

# ylabel sets the y-axis label

plt.title('String Title Here')

# sets the title of the chart / figure

plt.show()

# display the graph in a seperate window