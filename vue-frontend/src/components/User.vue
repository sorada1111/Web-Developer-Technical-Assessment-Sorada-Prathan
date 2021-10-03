<template>
    <div class ="container">
        <h1 class="text-center"> Username List </h1>
        <h6 class="text-center"> The highest randomized number is {{maxVal}}</h6>
        <table class="table table-striped">
            <thead>
                <th>User Photo</th>
                <th>Username </th>
                <th>User First Name </th>
                <th>User Last Name </th>
                <th>User number </th>
            </thead>
            <tbody v-for ="(user) in users" v-bind:key ="user.id">
                <tr v-if="user.ran == maxVal" id="highlight">
                    <td><img :src="buildImgUrl(user.id)" width="80px" height="auto"></td>
                    <td>{{user.username}}</td>
                    <td>{{user.firstName}}</td>
                    <td>{{user.lastName}}</td>
                    <td>{{user.ran}}</td>
                </tr>
                <tr v-else>
                    <td><img :src="buildImgUrl(user.id)" width="80px" height="auto"></td>
                    <td>{{user.username}}</td>
                    <td>{{user.firstName}}</td>
                    <td>{{user.lastName}}</td>
                    <td>{{user.ran}}</td>
                </tr>
            </tbody>

        </table>

    </div>
</template>

<script>
import UserService from '../services/UserService'

    export default{
        name: 'User',
        data(){
            return{
                users : [],
                maxVal: '',
                numbers: []
            }
            
        },
        methods:{
            getUsers(){
                UserService.getUser().then(response =>{
                    this.users = response.data.data;

                    for(var i =0; i < this.users.length;i++){
                        this.numbers[i] = this.users[i].ran;

                        }
                    console.log("this.number: ", this.numbers);
                    this.maxVal = Math.max.apply(Math, this.numbers);
                    console.log("maxValue: ",this.maxVal);
                    console.log(response.data.data);
             
                });
            },
            buildImgUrl(id){
                return require(`../assets/img${id}.jpg`);
            }
        },
        created(){
            // this.getUsers();
            this.interval = setInterval(() => this.getUsers(), 1000);

        }
    }
</script>

<style >

#highlight{
    background-color: #2819F4;
}
</style>