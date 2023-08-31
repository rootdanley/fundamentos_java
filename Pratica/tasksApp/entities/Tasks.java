package Pratica.tasksApp.entities;

public class Tasks {
  private String[] tasks;
  private int taskCount;

  // constructor
  public Tasks(int maxTasks) {
    tasks = new String[maxTasks];
    taskCount = 0;
  }

  // methods
  public void addTask(String task) {
    if (taskCount < tasks.length) {
      tasks[taskCount] = task;
      taskCount++;
      System.out.println("Tarefa adicionada: " + task);
    } else {
      System.out.println("A lista de tarefas está cheia.");
    }
  }

  public void removeTask(int idTask) {
    if (idTask < 0 || idTask >= taskCount) {
      System.out.println("Posição inválida.");
      return;
    }

    String taskToRemove = tasks[idTask];

    if (taskToRemove != null) {
      tasks[idTask] = null;
      System.out.println("Tarefa removida: " + taskToRemove);
    } else {
      System.out.println("Tarefa não encontrada.");
    }
  }

  public void listTasks() {
    System.out.println("Lista de Tarefas:");
    for (int i = 0; i < tasks.length; i++) {
      String task = tasks[i];
      if (task != null) {
        System.out.println("ID:" + i + " | " + task);
      }
    }
  }

}