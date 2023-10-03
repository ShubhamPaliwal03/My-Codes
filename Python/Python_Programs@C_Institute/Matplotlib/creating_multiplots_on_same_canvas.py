import matplotlib.pyplot as plt

import numpy as np

x = np.linspace(0, 5, 11) # (start, stop, num (number of values))

# numpy.linspace() returns an evenly spaced numpy array containing the specified number of random values w.r.t. the interval provided. It is similar to numpy.arrange(), but instead of step, it uses sample number.

y = x ** 2; # returns a numpy array containing squared values of numpy array x

plt.subplot(1, 2, 1) # (nrows, ncols, plot_number)

# used to draw multiple plots

plt.plot(x, y, 'r--')

plt.subplot(1, 2, 2)

plt.plot(y, x, 'g*-')

plt.show()