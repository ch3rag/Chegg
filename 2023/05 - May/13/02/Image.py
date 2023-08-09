def make_them_blue(img):
	for r in range(height(img)):
		for c in range(width(img)):
			if img[r][c] == (0, 255, 0):
				img[r][c] = (0, 0, 255)
