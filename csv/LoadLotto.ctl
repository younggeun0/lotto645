LOAD DATA
INFILE "D:\git\repositories\toyProjectLotto\csv\games.csv"
INTO TABLE lotto
INSERT
FIELDS TERMINATED BY ','
(
num,input_date,ball1,ball2,ball3,ball4,ball5,b_ball
)
BEGINDATA