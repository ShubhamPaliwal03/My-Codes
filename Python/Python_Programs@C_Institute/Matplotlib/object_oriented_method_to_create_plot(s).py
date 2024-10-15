import matplotlib.pyplot as plt

import numpy as np

x = np.linspace(0, 5, 11) # (start, stop, num (number of values))

# numpy.linspace() returns an evenly spaced numpy array containing the specified number of random values w.r.t. the interval provided. It is similar to numpy.arrange(), but instead of step, it uses sample number.

y = x ** 2; # returns a numpy array containing squared values of numpy array x

# create figure (empty canvas)

# fig = plt.figure()

# # add set of axes to the figure

# axes = fig.add_axes([0.1, 0.1, 0.8, 0.8])

# # ([left, bottom, width, height (range 0 to 1)])

# # Plot on that set of axes

# axes.plot(x, y, 'b')

# axes.set_xlabel('set x label')

# # notice the use of set_ to begin methods

# axes.set_ylabel('set y label')

# axes.set_title('set Title')

# plt.show()

# the advantage is that now have full control of hwere the plot axes are placed, and we can easily add more than one axis to the figure

fig = plt.figure()

# creates black canvas

axes1 = fig.add_axes([0.1, 0.1, 0.8, 0.8]) # main axes

axes2 = fig.add_axes([0.2, 0.5, 0.4, 0.3]) # inset axes

axes3 = fig.add_axes([0.7 , 0.2 , 0.15 , 0.2]) # inset axes

# larger figure axes1

axes1.plot(x, y , 'b')

axes1.set_xlabel('x_label_of_axes1')

axes1.set_ylabel('y_label_of_axes2')

axes1.set_title('Axes1_Title')

# Insert figure axes2

axes2.plot(y, x, 'r')

axes2.set_xlabel('x_label_of_axes2')

axes2.set_ylabel('y_label_of_axes2')

axes2.set_title('Axes2_Title')

# Insert figure axes3

axes3.plot(x, x**3, 'g--')

axes3.set_xlabel('x_label_of_axes3')

axes3.set_ylabel('y_label_of_axes3')

axes3.set_title('axes3_title')

plt.show()