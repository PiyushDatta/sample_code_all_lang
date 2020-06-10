use std::collections::HashMap;

struct Sample {
    id: i8,
    extra: i8,
}

impl Sample {
    pub fn new() -> Sample {
        Sample { id: 3, extra: 2 }
    }
    pub fn get_total(&self) -> i8 {
        self.id + self.extra
    }
}

#[derive(Clone, Copy, PartialEq, Debug)]
pub enum WaitTimeout {
    Default,
    Millis(u64),
}

fn main() {
    let mut map1 = HashMap::new();
    map1.insert("hello", "world");
    let my_sample = Sample::new();
    println!("total {}", my_sample.get_total());
    println!("hello {}", map1["hello"]);
    println!("Hello World!");
}
