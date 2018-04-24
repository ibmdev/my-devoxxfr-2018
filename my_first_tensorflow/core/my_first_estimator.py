import tensorflow as tf
import my_first_dataset
def main(argv):
    hello = tf.constant('Hello TensorFlow')
    sess = tf.Session()
    print(sess.run(hello))
    # Chargement des données
    (train_x, train_y), (test_x, test_y) = my_first_dataset.load_data()
    for key in train_x.keys():
        print('key : ' + key)
    print('Train X Size =  ' + str(train_x.keys().size))
    print('Train Y Size =  ' + str(train_y.size))
    print('Test X Size =  ' + str(test_x.keys().size))
    print('Test Y Size = ' + str(test_y.size))
    

tf.app.run(main)