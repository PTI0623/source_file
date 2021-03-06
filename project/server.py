from flask import Flask,render_template,send_file
import pandas as pd
from io import BytesIO
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

app=Flask(__name__,template_folder='templates',static_folder='static')

lr=LinearRegression()

data = pd.read_csv(
    'https://raw.githubusercontent.com/PTI0623/source_file/main/pythonProject/mldl/chap3/chap3.csv')
length=data['length'].to_numpy().reshape(-1,1)
weight=data['weight'].to_numpy()

lr.fit(length,weight)

@app.route("/") 
def index():
    aa = "aaa입니다"
    return render_template("index1.html",key1=aa)

@app.route("/img/<aa>")
def imgdown(aa):
    img = BytesIO() 
    plt.scatter(length,weight)
    plt.scatter(int(aa),lr.predict(( [[int(aa)]] )))
    plt.savefig(img,format="png",dpi=100)
    plt.close()
    img.seek(0)
    return send_file(img,mimetype="image/png")

app.run(debug=True)