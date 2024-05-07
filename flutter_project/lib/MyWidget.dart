import 'package:flutter/material.dart';

class Class1 extends StatelessWidget {
  const Class1({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: const Center(child: Text("this is my first app in flutter")),
        appBar: AppBar(
          foregroundColor: Colors.black87,
          title: const Text("App Bar"),
          backgroundColor: Colors.blueAccent,
        ),
      ),
    );
  }
}
