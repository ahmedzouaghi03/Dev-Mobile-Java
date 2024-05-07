import 'package:flutter/material.dart';

class Class4 extends StatelessWidget {
  const Class4({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text("4eme Application"),
          backgroundColor: Colors.blueAccent,
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              Container(
                child: Image.asset(
                  "teleport.jpg",
                  fit: BoxFit.fill,
                  width: 350,
                ),
              ),
              const Text("Teleport"),
            ],
          ),
        ),
      ),
    );
  }
}
